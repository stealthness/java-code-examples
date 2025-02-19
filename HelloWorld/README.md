# Hello World

the HelloWorld project is a simple project that prints "Hello World" to the console, and is often the first program that
people write when learning a new programming language.

However, HelloWorld is simple, but the program has many flaws, which in the following parts will be explored and improved.

## Part 1 - Hello World

This first part is the standard HelloWorld program that prints "Hello World" to the console.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

However, the first flaw to address is that the message "Hello World" is hardcoded in the program, and if we want to
change the message, we have to change the code and recompile the program.

## Part 2 - Hello World with a command line argument message

So now we want to improve the program so that we can pass a message as a command line argument, and the program will print
that message to the console, or default "Hello World!" if no arguments are given..

```java
public class HelloWorld {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello World");
        }
    }
}
```

However, changing messages is still limited to the command line arguments.
Also, the program output is to the console, which is not very flexible.

## Part 3 - Hello World decoupled

So now we are going to decouple the message and rendering from the HelloWorld program and introduce a `MessageProvider` 
and a `MessageRenderer` classes.

```java
public interface MessageProvider {
    String getMessage();
}
```

```java
public class MessageRenderer {
    private final MessageProvider messageProvider;

    public MessageRenderer(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public void render() {
        System.out.println(messageProvider.getMessage());
    }
}
```

So now the MessageProvider is responsible for providing the message, and the MessageRenderer is responsible for rendering, but
it is coupled with MessageProvider. So now our HelloWorld program will look like this:

```java
public class HelloWorld {
    public static void main(String[] args) {
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        MessageRenderer messageRenderer = new MessageRenderer(messageProvider);
        messageRenderer.render();
    }
}
```

However, the MessageProvider, and MessageRenderer are still hardcoded in the HelloWorld program. If we wanted to change
message renderer to ALLCAPSStandardOutMessageRenderer we would still have to change the code and recompile. We want to make it 
more flexible by allowing different implementations of MessageProvider and MessageRenderer.


## Part 4 - Hello World using Interfaces

So now we are going to introduce interfaces for MessageProvider and MessageRenderer.

```java
public interface MessageProvider {
    String getMessage();
}
```

```java
public interface MessageRenderer {
    void render();
}
```

So now we will have `MessageProviderImpl implements MessageProvider` and `StandardOutMessageRender implements MessageRenderer`.
So now HelloWorld program will look like this:

```java
public class HelloWorld {
    public static void main(String[] args) {
        MessageProvider messageProvider = new MessageProviderImpl();
        MessageRenderer messageRenderer = new StandardOutMessageRender(messageProvider);
        //
        messageRenderer.render();
    }
}
```

We still have hardcoded implementations of MessageProvider and MessageRenderer, so we want to make it more flexible by using 
different implementations of MessageProvider and MessageRenderer without recompiling the program.

## Part 5 - Hello World using Factory Pattern

So now we are going to introduce a MessageSupportFactory class that will be responsible for creating MessageProvider and
MessageRenderer instances.

```java
public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private MessageProvider messageProvider;
    private MessageRenderer messageRenderer;

    private MessageSupportFactory() {
        messageProvider = new MessageProviderImpl();
        messageRenderer = new StandardOutMessageRenderer(messageProvider);
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }

    public MessageRenderer getMessageRenderer() {
        return messageRenderer;
    }
}
```

So now our HelloWorld program will look like this:

```java
public class HelloWorld {
    public static void main(String[] args) {
        MessageSupportFactory messageSupportFactory = MessageSupportFactory.getInstance();
        MessageProvider messageProvider = messageSupportFactory.getMessageProvider();
        MessageRenderer messageRenderer = messageSupportFactory.getMessageRenderer();
        //
        messageRenderer.render();
    }
}
```
