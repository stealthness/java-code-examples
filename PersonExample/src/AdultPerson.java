/**
 * A representation of an adult that is extended from the Person class
 * contain information on the adult's employment
 */
public class AdultPerson extends Person {
    /**
     * The employment of the person, may be null if person is not working
     */
    private String employment;

    /**
     * Creates a new adult person
     * @param name of the person
     * @param age of the person, must be between 18 and 120 otherwise throws an IllegalArgument
     */
    public AdultPerson(String name, int age) {
        super(name, age);
        if (age <18 || age > 120){
            throw new IllegalArgumentException("age must be between 18 and 120");
        }
    }

    /**
     * Return the person's employment
     * @return employment
     */
    public String getEmployment() {
        return employment;
    }

    /**
     * Sets the person's employment
     * @param employment of the person
     */
    public void setEmployment(String employment) {
        this.employment = employment;
    }
}
