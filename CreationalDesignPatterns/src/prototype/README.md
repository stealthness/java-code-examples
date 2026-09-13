# The Prototype 

## The problem

We have an object that we want to creat a copy of it. But we may not have access to all of its fields to create a copy. 
To solve this we delegate the creation of object from itself via method `clone()`

```mermaid
---

title: Prototype Example
---


classDiagram


    class ShapeBuilder{
        createShape(String)$
        createShape(Shape)$
    }
    
    class Application
    
    class Shape {
        <<abstract>>
        -posX
        -posY
        -color
        #clone() Shape *
        +...()
    }
    
    class Rectangle{
        -width
        -height
        +clone() Shape
    }
    
    class Circle{
        -radius
        +clone() Shape
    }


    Application --> ShapeBuilder
    Application --o Shape
    Shape <|-- Rectangle
    Shape <|-- Circle
    ShapeBuilder --> Shape
    
```