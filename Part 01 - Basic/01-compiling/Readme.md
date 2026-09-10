# Installing Java

Java can be installed from iether an OpenJDK distribution or Oracle JDK distribution. 

After installing Java you can verify from comman line (or terminal in Linux/macOS)

```bash
java --version
javac -- version
```

The `java` is the command to run java programs and `javac` is the java compiler.

## HelloWorld Program

The "Hello World" is traditianlly the first program written when learning a new programming language. Before java25, a basic `HelloWorld` would look like this
 
```Java
public class HelloWorldOldStyle {

	public static void main(String[] args){
		System.out.println("Hello World");
	}
}
```

This would then saved as text file called `HelloWorldOldStyle.java`. The filename must match the class name. To run the program, the program file is required to be compiled into java bytecode. This acheived by following command:

```bash
javac HelloWorldOldStyle.java
```

the output would be something like this:

```bash
01/01/2026  00:00    <DIR>          .
01/01/2026  00:00    <DIR>          ..
01/01/2026  00:01               440 HelloWorldOldStyle.class
01/01/2026  00:01               196 HelloWorldOldStyle.java
```

The `.java` file contains human readable source code.  The `.class` file contains bytecode that can be executed by the Java Virtual Machine (JVM).

The compiled code can run using the command:

```bash
java HelloWorldOldStyle
```

Note we dont not type `HelloWorldOldStyle.class`. The computer is to look for the class named `HelloWorldOldStyle`. Java searches the classpath for the corresponding compiled .class file, loads the class into the JVM, and starts the program.

The program will output:
```bash
home/project/src> java HelloWorldOldStyle
Hello World
```

Since java11 we can compile and run `HelloWorldOldStyle` directly using the command.

```bash
home/project/src> java HelloWorldOldStyle.java
Hello World
```

This handles the compilation and execution process and is convenient for small programs or scripts.

## New Style HelloWorld

Java now supports  a simplified syntax for simple programs. Create file called `HelloWorldNewStyle.java` and type the code below:

```java
void main(){
	IO.println("Hello World")
}
```

You could compile again `javac HelloWorldNewStyle.java` which would create `HelloWorldNewStyle.class` and then run the program by using `java HelloWorldNewStyle`. However, for simplicity lets run directly:

```bash
java HelloWorldNewStyle.java
```

## Separating Compiled code from source code

A common project convention is to keep Java source code separate from compiled output.

We will label folder called `src` for source code and a folder `out` for compiled code. The prject structer should look like this:

```bash
project\
├── src\
└── out\
```

From the project directory, you can compile the program using:

```bash
javac -d out  src\HelloWorldNewStyle.java
java -cp out HelloWorldNewStyle
```

The -d option tells the Java compiler where to place the compiled output. The -cp option means classpath. The classpath is a list of locations that the JVM searches when looking for classes and other resources needed by a program.

As projects become larger, IDEs and build tools such as Maven and Gradle help manage source files, compiled code, dependencies, and project structure automatically.

## Notes on Old Style Hello World

Consider the following program:


```code
1	public class HelloWorldOldStyle {
2	
3		public static void main(String[] args){
4			System.out.println("Hello World");
5		}
6	}
```

All java files can contain several classes but can have at most one public class, it name must match the filename. 

The `public static void main(String[] args)` is the traditional entry point for a Java application. The `args` parameter contains command-line arguments supplied when starting the program.

```bash
java HelloWorldOldStyle Bob 1 two
```

The `args` array would be `{"Bob", "1", "two"}`. All command-line arguments are initially provided as strings. Therefore "1" is a string containg the character 1, not the integer value.

`System.out` represents the standard output stream. The `println()` method prints text to the console and then moves to a new line.

Newer Java versions also provide simpler APIs for console output, such as `IO.println("Hello World");`.

## What Does the JVM Do?

Java source code is compiled into Java bytecode. The bytecode is then executed by the Java Virtual Machine (JVM). A simplified process looks like this:

```
Java Source Code
      ↓
   javac
      ↓
Java Bytecode (.class)
      ↓
     JVM
      ↓
Machine Instructions
```

The JVM provides an abstraction layer between Java programs and the underlying operating system and hardware. Modern JVMs use a combination of interpretation and Just-In-Time (JIT) compilation to execute Java bytecode efficiently.

Because different platforms provide JVM implementations for their operating systems and hardware, the same Java bytecode can often run on different systems without changing the Java source code. This is the idea behind Java's famous philosophy: _*Write once, run anywhere.*_

## Changes in Java Coding Style Over 25 Years

Java has been around for many years and has changed significantly. Because of this, you may encounter code written in different styles depending on when it was created.

Here are some important milestones.

+ Before Java 5 – Java code often used more verbose patterns that would now be considered outdated.
+ Java 5 – Introduced major language improvements such as generics, annotations, enums, and enhanced for loops. Generics improved type safety and reduced the need for explicit type casting.
+ Java 8 – Introduced lambda expressions and the Stream API, making functional-style programming more common in Java.
+ Java 9 – Introduced the Java Platform Module System and began the modern six-month release cycle.
+ Java 11, 17, 21, and 25 – Long-Term Support (LTS) releases that are commonly used in production environments.
+ Recent Java releases – Introduced features such as records, sealed classes, pattern matching, switch expressions, and virtual threads.

Many of these changes reduce repetitive boilerplate code and make Java programs easier to read and maintain.

### Preview Features

Java continues to evolve, and some new language features are introduced as preview features. Preview features allow developers to experiment with new functionality before it becomes a permanent part of the Java language. Because preview features can change between releases (a few times been removed), they should be used carefully, especially in production applications.

## Summary

Java development generally follows this process:

Write Java Source Code
        ↓
Compile with javac
        ↓
Create Java Bytecode
        ↓
Run with java
        ↓
Execute on the JVM

For simple programs, modern Java also allows you to run a source file directly:

java HelloWorld.java

As you continue learning Java, you will see how IDEs, build tools, packages, modules, and project structures automate much of this process.