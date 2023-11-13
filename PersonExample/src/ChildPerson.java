/**
 * A representation of a child that is extended from the Person class
 */
public class ChildPerson extends Person {
    /**
     * The child's school, may be null
     */
    private String school;

    public ChildPerson(String name, int age) {
        super(name, age);
        if (age < 3 || age >= 18){
            throw new IllegalArgumentException("A child's age must be over 3 and under 18");
        }
    }

    /**
     * returns the child's school
     * @return school the child's school
     */
    public String getSchool() {
        return school;
    }

    /**
     * Set the child's school
     * @param school the school that the child attends
     */
    public void setSchool(String school) {
        this.school = school;
    }
}
