/**
 *
 * @param args, command line arguments
 */

void main(String[] args){

    // values
    int x = 5;
    int y = 20;
    String s = "Birkbeck";

    IO.println("Values x is " + x + " and y is " + y + " and s is " + s);

    boolean expression1 = (x == 5 && y == 10);
    boolean expression2 = (x < 0 || y > 15);
    boolean expression3 = (y % x == 0 && s.length() == 8);
    boolean expression4 = (s.substring(1,3).equals("Bir") || x / y > 0);

    IO.println("(x == 5 && y == 10) is " + expression1);
    IO.println("(x < 0 || y > 15) is " + expression2);
    IO.println("(x % x == 0 && s.length() == 8) is " + expression3);
    IO.println("(s.substring(1,3).equals(\"Bir\") || x / y > 0) is " + expression4);

}