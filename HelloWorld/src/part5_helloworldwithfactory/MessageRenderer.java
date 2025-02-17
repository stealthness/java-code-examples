package part5_helloworldwithfactory;

/**
 * MessageRenderer interface provide a method to render message
 */
public interface MessageRenderer {

    /**
     * Render a message
     */
    void render();

    /**
     * Set a message provider
     * @param provider a message provider
     */
    void setMessageProvider(MessageProvider provider);

}
