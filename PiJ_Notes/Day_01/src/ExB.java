/**
 * Write a program that asks the user to type in 5 numbers, and that outputs the largest of these numbers and the smallest of these numbers. So, for example, if the user types in the numbers 2456 457
 * 13 999 35, the output will be as follows:
 * The largest number is 2456
 * The smallest number is 13
 */

void main(String[] args){

    int[] numbers = new int[5];


    if (args.length > 0){ // check if any numbers given on command line
        numbers = new int[args.length];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(args[i]);
        }
    } else{ // ask for user input
        for (int i = 0; i < numbers.length; i++){
            String input = IO.readln("Enter number: ");
            numbers[i] = Integer.parseInt(input);
        }
    }

    // set the lowest and highest to the first value of numbers
    int lowest = numbers[0];
    int highest = numbers[0];
    for (int i = 0; i < numbers.length; i++) {
        // check the lowest
        if (numbers[i] < lowest) {
            lowest = numbers[i];
            continue; // a number cannot be lowest and highest so we can continue
        }
        if (numbers[i] > highest) {
            highest = numbers[i];
        }
    }
    // later we will use enhanced for loop
/*    for (int number : numbers) {
        // check the lowest
        if (number < lowest) {
            lowest = number;
            continue; // a number cannot be lowest and highest so we can continue
        }
        if (number > highest) {
            highest = number;
        }
    }*/

    IO.println("lowest: " + lowest);
    IO.println("highest: " + highest);

}