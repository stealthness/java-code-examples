/**
 * This program will take in a year and will out put whether the year is
 * a leap year or not.
 * A reminder of the rules Gregorian calendar.
 *  - A year that is divisible by 4 is a Leap Year unless,
 *  - The year is divisible by 100 then it is not, unless
 *  - The year is divisible by 400 then it is Leap Year.
 */
void main(String[] args) {
    int year;
    if (args.length > 0){
        year = Integer.parseInt(args[0]);
    } else{
        String input = IO.readln("Enter an integer?@");
        year = Integer.parseInt(input);
    }

    if (year % 400 == 0){
        IO.println(year + " is a Leap year");
    } else if (year % 100 == 0){
        IO.println(year + " is NOT a Leap year");
    } else if (year % 4 == 0){
        IO.println(year + " is a Leap year");
    } else {
        IO.println(year + " is NOT a Leap year");

    }

}
