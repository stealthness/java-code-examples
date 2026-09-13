/**
 * This program will either take a array of numbers from the command-line or ask the users for a number if integer numbers
 * The use will first be ask for the size of the array to fill, the ask to enter the amount of integer numbers.
 *
 */
void main(String[] args) {
    int[] numbers;
    if (args.length > 0){
        // handle case when there are command-line arguments
        numbers = new int[args.length];
        for (int i = 0 ; i < args.length ; i++){
            // we are not validating the args value and assume all values are integers.
            numbers[i] = Integer.parseInt(args[i]);
        }
    } else {
        // handle the case for when the user is require to enter the values
        // ask for the amount of numbers to enter
        int amount = Integer.parseInt(IO.readln("Enter an integer fo the amount of numbers to enter?"));
        numbers = new int[amount];
        for (int i = 0 ; i < amount ; i++){
            numbers[i] = Integer.parseInt(IO.readln("Enter an integer value?"));
        }

    }

    // print the result to the console

    String message = "The list of numbers is ";
    for (int number : numbers) {
        // this string concatenation
        message = message + number + " ";
    }
    IO.println(message);

}