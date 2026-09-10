# Basic Java Flow Control

Java has several flow structures that can be found in most procedural languages and are the bedrock of programming. Java borrowed heavily from C and C++ which was predominate language when Java was being created.

List flow structures

+ `if`, `else if`, `else`, a control struct that if something is true do this, if something else is true do that, otherwise if nothing is true do this instead.
+ `while`, `do...while`, `for` loop until a condition is met
+ `switch`, simple version  of switch is just alternative `if else` structure for more readability.
+ - `break`, exits a loop or `switch` statement
  - `continue`, skips the rest of the current loop iteration
  - `return` exit a method, can be used to exit loops and condition structure.

You will look at these flow structure with examples.

## Example 1 : Odd or Even

_*Problem*_

_*Create a program that takes an integer value from the command-line and determines whether the number is even or odd.*_

A number is even if it can be divided by `2` with no remainder. This includes the number `0`.

For this problem, we will use `Integer.parseInt()` methode to convert a String, that is made up of digits, to an integer number. 
We shall assume that the user provides a valid number input.

_*Solution *_

This file has been saved as `Example01OddOrEven.java`

```java
void main(String[] args){
	
	// Check that command-line arguments has at least one value
	if (args.length == 0){
		IO.println("No command-line arguments given");
		return; // this pattern is sometime called an escape clause.
	}
    
    // parsing the string value
	int value = Integer.parseInt(args[0]);
    
    // outputting the result using a ternary operator
	IO.println("The value of " + value + " is " + ((value % 2 == 0)?"Even":"Odd"));
	
	// Above is a ternary operator is equivalent to if else code below
	if (value % 2 == 0){
		IO.println("The value of " + value + " is even");
	} else {
		IO.println("The value of " + value + " is odd");
	}
		
}
```

Notes on the solution:

+ The following expression determines if a number is even `value % 2 == 0`, the `%` modulus operator returns the remainder
  after the division. If there is no remainder then number is divisible by `2`, thus is Even, otherwise it is Odd.
+ The general format of a ternary operator is `condition ? valueIfTrue : valueIfFalse` and it is equivalent to `if else`
  given in the code. For simple condition ternaries are easier to read.


To test our code run the following lines from command-line or terminal.

```bash
java src/Example01OddOrEven.java
```

we should then expect to see

```text
No command-line arguments given
```

Now if we add a suitable commandline arguments

```bash
java src/Example01OddOrEven.java 5
java src/Example01OddOrEven.java 6
```

Should result in :

```text
The value of 5 is Odd
The value of 6 is Even

```
### Alternative Solution in Tradition Java code style

A more traditional java program solution would like:

```java
public class Example{
    
    public static void main(String[] args){

        if (args.length == 0){
            IO.println("No command-line arguments given");
            return;
        }

        int value = Integer.parseInt(args[0]);

        System.out.println("The value of " + value + " is " + ((value % 2 == 0)?"Even":"Odd"));
        
    }
}



```

Where we wrap the program around a public class and use `paublic static void main(String[] args)` as the entry point.

## Modify solution to accept user input

Let us modify the solution so that if the user provides no command-line argument, the program will ask for an integer from
the user. We shall assume that user inputs a valid integer number.

Save the solution as `Example01OddOrEvenImproved.java`

```java
void main(String[] args){
    
	int value; // declare our variable and its type
    
	if (args.length > 0){
        value = Integer.parseInt(args[0]);
	} else {
        String input = IO.readln("Enter an integer: ");
        value = Integer.parseInt(input);
    }
    
    // outputting the result
	IO.println("The value of " + value + " is " + ((value % 2 == 0)?"Even":"Odd"));
		
}
```

Notes of the solution
+ We declare the value outside of the `if else` block of code so that its value can be used after the block. This is 
  known as the scope of the variable

Test the program, first by checking that existing test still work then by input and odd and an even number

```test
java src/if_example_01_odd_even.java 5
java src/if_example_01_odd_even.java 6
java src/if_example_01_odd_even.java
```

### Invalid inputs

At the moment we are not validating the user input. If a user enter `Bob` we would get a Runtime error with the exception
`java.lang.NumberFormatException`. we will learn later how to validate user input and deal with handling errors.

## Example 2 : FizzBuzz

// to do...



