package part5_helloworldwithfactory;


public class MessageSupportFactory {
    private static final MessageSupportFactory instance;

    private final MessageProvider messageProvider;
    private final MessageRenderer messageRenderer;

    private MessageSupportFactory() {
        messageProvider = new MessageProviderImpl();
        messageRenderer = new StandardOutMessageRenderer();
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
