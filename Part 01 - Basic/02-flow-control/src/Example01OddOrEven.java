/**
 * This is a simple if example. 
 * Take a number from commandline, use Integer.Parseint to convert
 * a string to an int. Then determin if the int is odd or even (which includes zero) and write out 
 * to the console the result.
 */
void main(String[] args){
	
	// Check that args has at least one value
	if (args.length <= 0){
		IO.println("No command line arguments given");
		return; // this pattern is sometime called an escape cluase. We dont need to check rest of the programme as we have failed this check.
	}

	
	int value = Integer.parseInt(args[0]);
	
	
	IO.println("The value of " + value + " is " + ((value % 2 == 0)?"Even":"Odd"));
	
	// Above is a tenery operator which is the equvialent of the code below
	if (value % 2 == 0){
		IO.println("The value of " + value + " is even");
	} else {
		IO.println("The value of " + value + " is odd");
	}
		
}