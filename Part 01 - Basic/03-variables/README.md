# Basic Java Variables, Primitives and Data Types

Within the Java Virtual Machine (JVM) manages memory for your program. The JVM has a stack and a heap. The stack is used
for method calls and local variables, while the heap is used for objects and instance variables. Whilst java is an 
object-oriented programming language, it is not pure as it also has primitive data types that are not objects. 
These primitive data types are stored on the stack and are more efficient than objects, and in Java there are eight
primitive types. The primitive types are `byte`, `short`, `int`, `long`, `float`, `double`, `boolean` and `char`.

## Primitive Data Types

+ `byte` is an 8-bit signed integer with a range of -128 to 127.
+ `short` is a 16-bit signed integer with a range of -32,768 to 32,767.
+ `int` is a 32-bit signed integer with a range of -2,147,483,648 to 2,147,483,647.
+ `long` is a 64-bit signed integer with a range of -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
+ `float` is a 32-bit floating-point number with a range of approximately ±3.40282347E+38F (6-7 significant decimal digits).
+ `double` is a 64-bit floating-point number with a range of approximately ±1.79769313486231570E+308 (15 significant decimal digits).
+ `boolean` is a data type that can only have two values: `true` or `false`. Note unlike some other programming languages,
+ Java does not have a numeric representation for `boolean` values. 
+ `char` is a 16-bit Unicode character with a range of '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).

## Object Data Types

Apart from the primitive types, all other data types in Java are objects, The base class of all objects is the class Object.
The most commonly used object data type is `String`, which is a sequence of characters.

to create a new object of a class, you use the `new` keyword followed by the class name and parentheses. For example, to
create a new Object, you would write:

```java
Object obj = new Object();
```

THe Object class has several methods that are inherited by all other classes, including `toString()`, `equals()`, and `hashCode()`.
will look at these methods in more detail later.

To create a new String object, you can use the `new` keyword or simply use double quotes. For example:

```java
String str1 = new String("Hello");
// Since String is commonly used, Java allows you to create a String object without using the `new` keyword:
String str2 = "Hello";
```

one structure that neither primitive or object is an array. An array is a collection of elements of the same type, and
can be either primitive or object types. Whilst arrays of primitive types or object types have same syntax use, the JVM
treats them differently. Arrays are stored on the heap, and the array variable is a reference to the array object on the heap.
