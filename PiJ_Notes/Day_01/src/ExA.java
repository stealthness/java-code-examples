/**
 * Write a program that outputs the squares of all the numbers from 1 to 10, i.e., the output will be the
 * numbers 1, 4, 9, 16 and so on up to 100
 */
void main(){

    // NOTES forget to i <= 10 as we want to include output 100
    // NOTES i starts from 1
    for (int i = 1; i <= 10; i++){
        IO.println(i*i);
    }

    // Improved solution

    // set a max value to square as variable
    int maxValue = 10;
    // we create a string array to store the squares as strings
    String[] output = new String[maxValue];
    for (int i = 1; i <= maxValue; i++){
        output[i - 1] = "" + i * i;
    }
    // by storing the numbers as string we can then use static method in String to join the them and out put the result.
    IO.println(String.join(", ", output));
}

