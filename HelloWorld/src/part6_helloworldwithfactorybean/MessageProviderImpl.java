package part6_helloworldwithfactorybean;

public class MessageProviderImpl implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World using a factory using properties";
    }
}
