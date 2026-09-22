/**
 * This program will ask the users for a number integer numbers. It will stop asking when either 'x', 'exit', 'stop'
 * is entered. Otherwise, it will continue to ask for integer numbers.
 * We store the numbers in String "1 27 83 -12" each number separated by a space. Why not as an array? An array is
 * of a fixed sized. every tine we enter a new number we need to reinitialize an array with increased size, copy the
 * original array contents, and then add the new entry. Later will we will use dynamic List to solve this issue
 *
 */
void main(String[] args) {
    String numbers = "";
    String input = "";

    while (true){
        input = IO.readln("Enter an number");
        if (input.equals("x")){
            // break out of the loop
            break;
        }
        if (input.isEmpty()){
            // no number added so skip to next iteration of the loop
            continue;
        }
        numbers += input + " ";


    }

    // print the result to the console

    String message = "The list of numbers is " + numbers;
    IO.println(message);

}