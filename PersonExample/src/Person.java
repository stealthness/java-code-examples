/**
 * A person Class
 */
public abstract class Person {

	/**
	 * The name of the person, must not be null
	 */
	protected final String name;

	/**
	 * The age of the person, default is value is 0
	 */
	protected int age;

	/**
	 * population a count of the number of person objects created
	 */
	private static int population = 0;
	
	// constructor


	/**
	 * Constructs a Person with a given name, and default age of 0
	 * throws IllegalArgumentException if name is null
	 * @param name
	 */
	public Person(String name){
		this(name, 0);
		population++;
	}

	/**
	 * Constructs a Person with a given name and age
	 * throws IllegalArgumentException if name is null
	 * @param name, the name of the person
	 * @param age, the age of the person
	 */
	public Person(String name, int age){
		if (name == null){
			throw new IllegalArgumentException("A person's name should not be null");
		}
		this.name = name;
		this.age = age;
		population++;

	}

	/**
	 * Get the Persons name
	 * @return the person's name
	 */
	// methods
	public String getName() {
		return name;
	}

	/**
	 * Prints out a birthday message and increase the age by 1
	 */
	public void birthday() {
		age++;
		System.out.println("Happy birthday!");
	}

	/**
	 * Return the population, the number persons created
	 * @return population, the number of persons created
	 */
	public static int getPopulation() {
		return population;
	}
}
