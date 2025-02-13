package part3_helloworlddecoupled;

public class StandardOutMessageRenderer {

    private MessageProvider messageProvider = null;

    /**
     * Renders a message provider by MessageRenderer
     */
    public void render(){
        if (messageProvider != null) {
            System.out.println(messageProvider.getMessage());
        } else {
            throw new RuntimeException("You must set a property messenger of the class " + StandardOutMessageRenderer.class.getName());
        }
    }

    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }
}
