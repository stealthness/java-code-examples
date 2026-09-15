import java.io.IO;

/**
 * From part 02 flow control create static methods that
 * returns boolean result if a number is odd or even
 * returns as string the result of FIZZBUZZ
 * returns boolean result if a string representing a year is leap year
 * You do not need to validate the input and assume the user will give a valid input.
 * Test the methods using selection of inputs
 */
public class MethodExample01
{
    void main(){
        int[] testNumbers = new int[]{1,2,45,98,0};
        for (int test : testNumbers){
            IO.println(test + " is an " + (isEven(test)?"even":"odd") + " number");
        }
        testNumbers = new int[]{3, 5, 10, 12, 15, 20};
        for (int testNumber : testNumbers){
            IO.println("The result of " + testNumber + " for FIZZBUZZ is " + getFizzBuzz(testNumber));
        }
        String[] testNumberStrings = new String[]{"1907", "1984", "1900", "2000"};
        for (String numberString : testNumberStrings){
            boolean isLeapYear = isLeapYear(numberString);
            IO.println("the year " + numberString + " is a leap year is " + isLeapYear);
        }
    }

    private static boolean isLeapYear(String numberString) {
        int year = Integer.parseInt(numberString);
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0){
            return false;
        }
        return year % 4 == 0;
    }

    private static String getFizzBuzz(int testNumber) {
        if (testNumber % 5 == 0 && testNumber % 3 == 0){
            return "FIZBUZZ";
        } else if (testNumber % 3 == 0 ){
            return "FIZZ";
        } else if (testNumber % 5 == 0 ){
            return "BUZZ";
        }
        return "" + testNumber;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
