package part4_helloworldwithinteface;

public class MessageProviderImpl implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World using interface";
    }
}
