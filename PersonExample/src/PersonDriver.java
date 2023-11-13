/**
 * A simple class to test the Person, ChildPerson and
 */
public class PersonDriver {
    public static void main(String[] args) {
        System.out.println("Start");
        Person adult1 = new AdultPerson("Ant", 20);
        Person child = new ChildPerson("Bob", 5);
        System.out.println(Person.getPopulation());
    }
}