/**
 * This is a simple example to demonstrate if conditional flow structure.
 * Take a number from commandline, use Integer.ParseInt to convert
 * a string to an int. Then determine if the int is odd or even (which includes zero) and write out
 * to the console the result.
 */
void main(String[] args){

	int value;
	if (args.length > 0){
		value = Integer.parseInt(args[0]);
	} else {
		String input = IO.readln("Enter an integer?\n");
		value = Integer.parseInt(input);
	}
	
	IO.println("The value of " + value + " is " + ((value % 2 == 0)?"Even":"Odd"));
		
}