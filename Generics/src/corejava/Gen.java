package corejava;

/**
 * This code is from Core Java : The complete Reference
 *
 * @param <T>
 */
public class Gen<T> {

    private T ob; // declare an object of type T

    /**
     * pass the constructor a reference to an object of type T
     * @param o
     */
    public Gen(T o){
        ob = o;
    }

    /**
     * returns the object ob of type T
     * @return ob
     */
    public T getOb(){
        return ob;
    }

    /**
     * Show the type of T of the object ob
     */
    public void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
