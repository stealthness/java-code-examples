package part6_helloworldwithfactorybean;

public class HelloWorld {

    public static void main(String[] args) {

        MessageSupportFactory factory = MessageSupportFactory.getInstance();
        MessageRenderer mr = factory.getMessageRenderer();
        MessageProvider mp = factory.getMessageProvider();

        mr.setMessageProvider(mp);
        mr.render();
    }
}
