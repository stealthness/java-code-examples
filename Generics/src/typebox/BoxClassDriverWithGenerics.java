package typebox;

public class BoxClassDriverWithGenerics {

    public static void main(String[] args) {
        BoxClass<Integer> intBox = new BoxClass<>(5);
        BoxClass<Double> doubleBox = new BoxClass<>(5.0);
        BoxClass<String> stringBox = new BoxClass<>("five");

        // the BoxClass class is now reusable for any type

        System.out.println("intBox has value : " + intBox.getValue());
        System.out.println("doubleBox has value : " + doubleBox.getValue());
        System.out.println("stringBox has value : " + stringBox.getValue());

        // However ther still limitations
        BoxClass objectBoxString = new BoxClass("five");
        // here we have raw type, which is not recommended, but was necessary for backward compatibility

        System.out.println("length stringBox is : " + ((String)objectBoxString.getValue()).length());
        // we need to cast becuase the type is Object

        objectBoxString = stringBox;
        System.out.println("length stringBox is : " + ((String)objectBoxString.getValue()).length());
        // this is allowed because of type erasure, but we still need to use a cast because the type is Object, while
        // the value is a String

        objectBoxString = intBox;
        System.out.println("length stringBox is : " + ((String)objectBoxString.getValue()).length());
        // This will compile but cuase a runtime error because the value is an Integer, not a String
    }

}

/**
 * This class is used to test the BoxClass class and show why generics was introduced.
 * T is a type parameter
 * @param <T>
 */
class BoxClass<T>{

    private T value;

    public BoxClass(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
}
