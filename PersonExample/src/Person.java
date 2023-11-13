/**
 * A person Class
 */
public class Person {
	/**
	 * name
	 */
	private String name;
	/**
	 * age
	 */
	private int age;
	/**
	 * population
	 */
	private static int population = 0;
	
	// constructor


	/**
	 * Constructs a Person
	 * @param name
	 */
	public Person(String name) {
		this(name, 0);
		population++;
	}

	public Person(String name, int age){
		this.name = name;
		this.age = age;
		population++;

	}

	/**
	 * Get the Persons name
	 * @return
	 */
	// methods
	public String getName() {
		return name;
	}
	
	public void birthday() {
		age++;
		System.out.println("Happy birthday!");
	}

	public static int getPopulation() {
		return population;
	}
}
