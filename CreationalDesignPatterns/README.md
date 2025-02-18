# Creational Design PAtterns

The modules ae collection software design patterns that deal with object creation mechanisms, trying to create objects in suitable way to allow flexibility, maintenance and future change.  Creational design patterns solve this problem by somehow controlling this object creation.

A lot of the material is developed from the book Refatoring Guru. The link to the book is [here](https://refactoring.guru/design-patterns/creational-patterns).

The list of creational design patterns are as follows:

1. [Singleton Pattern](#singleton-pattern)
2. [Factory Method Pattern](#factory-method-pattern)
3. [Abstract Factory Pattern](#abstract-factory-pattern)
4. [Builder Pattern](#builder-pattern)
5. [Prototype Pattern](#prototype-pattern)
6. [Object Pool Pattern](#object-pool-pattern)
7. [Dependency Injection Pattern](#dependency-injection-pattern)
8. [Lazy Initialization Pattern](#lazy-initialization-pattern)
9. [Multiton Pattern](#multiton-pattern)


## Singleton Pattern

The singleton pattern is a design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system. The concept is sometimes generalized to systems that operate more efficiently when only one object exists, or that restrict the instantiation to a certain number of objects. The term comes from the mathematical concept of a singleton.

In java a singleton can be implemented as follows:

+ Eager initialization Singleton
+ Static block initialization Singleton
+ Lazy Initialization Singleton
+ Thread Safe Singleton
+ Bill Pugh Singleton Implementation
+ Enum Singleton
