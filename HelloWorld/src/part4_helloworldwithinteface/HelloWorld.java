package part4_helloworldwithinteface;

public class HelloWorld {

    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new MessageProviderImpl();
        mr.setMessageProvider(mp);
        mr.render();

        // if we wanted to use another implementation of MessageProvider we would still need
        // to change the code here.
    }
}