/**
 * This is a simple if example. 
 * FizBuzz is childs game where if a given number is divisable by 3 the child shouts "Fiz".
 * If the number is divisable by 5 the child shouts "Buzz", and if a number if divisable 3 and five the child shouts "Fizbuzz". 
 * In all other cases the child just calls back the number given.
 * Write the code to taken in a number from commandline or from console and return the correct fizbuzz responce responce.
 */
void main(String[] args){
	// we must declare the variable outside the scopt of if block so it will be avaiable for who of the method main
	int value;
	
	// Check that args has at least one value
	if (args.length > 0){
		value = Integer.parseInt(args[0]);
	} else {
		String input = IO.readln("Enter a number");
		// We shall assume that a user will enter a valid number
		value = Integer.parseInt(input);
	}
	
	if (value % 5 == 0 && value % 3 == 0){
		IO.println("FIZBUZZ");
	} else if (value % 3 == 0 ){
		IO.println("FIZ");
	} else if (value % 5 == 0 ){
		IO.println("BUZZ");
	} else {
		IO.println(value);
	}		
	
	// Alternative Nested if soultion. In general we would prefer not use nested if when possible
	
	if (value % 5 == 0){
		if (value % 3 == 0){
			IO.println("FIZBUZZ");
		} else {
			IO.println("BUZZ");
		}
	} else {
		if (value % 3 == 0){
			IO.println("FIZZ");
		} else{
			IO.println(value);
		}
	}
	
	// Alternative Old style code
	// java.util is the package where the Scanner class is located, it can be removeed if we use import java.util
	java.util.Scanner scanner = new Scanner(System.in);
	
		// Check that args has at least one value
	if (args.length > 0){
		value = Integer.parseInt(args[0]);
	} else {
		// we use nextLine rather than nextInt due to common console bug that add extra return character and will cuase the parseInt to fail.
		System.out.println("Enter an integer number");
		String input = scanner.nextLine();
		// We shall assume that a user will enter a valid number
		value = Integer.parseInt(input);
	}
	
	if (value % 5 == 0 && value % 3 == 0){
		System.out.println("FIZBUZZ");
	} else if (value % 3 == 0 ){
		System.out.println("FIZ");
	} else if (value % 5 == 0 ){
		System.out.println("BUZZ");
	} else {
		System.out.println(value);
	}	
		
}