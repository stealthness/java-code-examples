package instantiate.instructions;

public abstract class Instruction<T extends Number> {

    protected static String opeatorString;

    public abstract T execute();

}
