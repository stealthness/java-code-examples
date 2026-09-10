# Installing Java

Java can be installed from iether OpenJDK or Oracle

## HelloWorld Program

Hello World is a tradition first program to write in any language. In pre-java25 a basic `HelloWorld` would look like this
 
```Java
public class HelloWorldOldStyle {

	public static void main(String[] args){
		System.out.println("Hello World");
	}
}
```

This would then saved as `HelloWorldOldStyle.java`. To run the program would first require us to compile the program in java bytecode. We do this by using following command from the src directory

```bash
javac HelloWorldOldStyle.java
```

we would then see something like:

```bash
01/01/2026  00:00    <DIR>          .
01/01/2026  00:00    <DIR>          ..
01/01/2026  00:01               440 HelloWorldOldStyle.class
01/01/2026  00:01               196 HelloWorldOldStyle.java
```

We can now run the compiled code using command:

```bash
java HelloWorldOldStyle
```

Note we dont not type `HelloWorldOldStyle.class`. What we are telling the computer to do is to look for the Class `HelloWorldOldStyle`. The java program we look for this class in files maked .class. When finds the class it will then load it into JVM (Java virtual Machine) and run the program. 

The JVM is program that will interperate the byte code to machine language for for your system. This how can run the same program for differernt machines. As each JVM will be wriiten for computers operating system. Thsi how java acheive the write once run any where philosphy.

The program will output:
```bash
home/project/src> java HelloWorldOldStyle
Hello World
```

Since java25 we can now run `HelloWorldOldStyle` like a script without compiling using command

```bash
home/project/src> java HelloWorldOldStyle.java
Hello World
```

## New Style HelloWorld

Create file called `HelloWorldNewStyle.java` and type the code below:

```java
void main(){
	IO.println("Hello World")
}
```

We can also compile again `javac HelloWorldNewStyle.java` whish would create `HelloWorldNewStyle.class` and we run that by using `java HelloWorldNewStyle`. For simplicity lets use Java25+ to run as script and type:

```bash
java HelloWorldNewStyle.java
```

## Separating Compiled code from source code

There are different convention to setting up a project to seperate source code `.java` and copiled code `class`. Later you will see how IDEs and build structure make process more manageable. For moment want show at basic level what IDEs do under the hood.

We will keep what know as source code, human readable code in text format, sepearate from compiled byte code that is binary data (1 and 0s) that machine readable only. We will label folder called `src` for source code and a folder `out` for compiled code.

```bash
project\
├── src\
└── out\
```

from command line make sure you in project folder. Now to compile we use:

```bash
javac -d out  src\HelloWorldNewStyle.java
java -cp out HelloWorldNewStyle
```

Where `-cp` meand add the folder to the classpath. The classpath will be list of location that jVM will search for to find the class to run. By default the level that java is run from, in this from folder `project` will also be included on classpath. That is why before we did not have add a location to the class path.

## Notes on Old Style Hello World

Since you may have to write code that is backward compitable, and becuase there is some usefull infor mation about the old Style structre


```code
1	public class HelloWorldOldStyle {
2	
3		public static void main(String[] args){
4			System.out.println("Hello World");
5		}
6	}
```

All java file must have one public class, it name must match the filename.

public static Void main is special static method which is the main entry point for java program to run. The array of string will be formed from any words added after command line.

```bash
java HelloWorldOldStyle Bob 1 two
```

then value of the args will be an array of String with value {"Bob", "1", "two"}, noting that "1" is the string with 1 character and not value of the int 1.

`System.out` is an PrintStream Class that will handle console output. It has a method `println` that is used to print to console.

From java25 IO.println is improve Class at this stage does the same. 

## Changes of Java coding Stye over 25 years

becuase jav has been around and evovled over 25 years it is common to see example of code that where oftern wriiten for different version. Here short history of version that change java signifcantly

+ Before Java5, you will see very litttle of code example, code style by modern standards was antiquated.
+ Java 5 and generic, one first major steps in changing how code was written. provide compile time type safty removing the need for typecasting.
+ java 8 saw lambda expression, enable functional style programmin
+ Before java 9 versioning would be measured in years, since java9 versioning was around 6months cycle, with 11,17,21,25 being LTS (long term support) versions 
+ Across the next several versions would see improvement with Pattern Matching, records, Sealed class, Switch Expression, Virtual Threads. Much of the improvment would help remove common boiler plate that java in early years was known for.
+ It is now common to see feature added as preview.