package part4_helloworldwithinteface;

public class StandardOutMessageRenderer implements MessageRenderer {

    MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set a property messenger of the class " + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        messageProvider = provider;
    }
}
