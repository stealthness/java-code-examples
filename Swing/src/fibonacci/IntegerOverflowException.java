package fibonacci;

public class IntegerOverflowException extends Throwable {
    public IntegerOverflowException(String integerOverflow) {
        super(integerOverflow);
    }
}
