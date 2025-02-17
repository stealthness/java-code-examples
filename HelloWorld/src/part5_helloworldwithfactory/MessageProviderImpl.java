package part5_helloworldwithfactory;

public class MessageProviderImpl implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World using a factory";
    }
}
