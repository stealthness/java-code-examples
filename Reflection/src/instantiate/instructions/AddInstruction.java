package instantiate.instructions;

public class AddInstruction<T extends Number>  extends Instruction <T> {

    private final T number1;
    private final T number2;


    public AddInstruction(T number1, T number2) {
        super();
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public T execute() {
        return (T) (Number) (number1.doubleValue() + number2.doubleValue());
    }
}
