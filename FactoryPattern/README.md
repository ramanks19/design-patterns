# Factory Pattern

**A creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.**


**Steps to implement Factory Pattern**-
- Make all products follow the same interface. This interface should declare methods that make sense in every product.
- Add an empty factory method inside the creator class. The return type of the method should match the common product interface.
- In the creator’s code find all references to product constructors. One by one, replace them with calls to the factory method, while extracting the product creation code into the factory method.
- Now, create a set of creator subclasses for each type of product listed in the factory method. Override the factory method in the subclasses and extract the appropriate bits of construction code from the base method.


Here, we define the Shape interface and two concrete implementations of the Shape interface: Rectangle and Circle. We also define the ShapeFactory class, which has a getShape() method that takes a shapeType parameter and returns a Shape object based on the shapeType parameter. Finally, we have the Main class, which demonstrates how to use the ShapeFactory class to create Rectangle and Circle objects. This example demonstrates how the Factory Pattern can be used to create objects without exposing the object creation logic to the client. The client only needs to know the shapeType parameter, and the ShapeFactory class handles the creation of the Shape objects. This can be useful when there are multiple types of objects that need to be created, and the creation logic is complex or subject to change.


**When to use it** - 
- The Factory Pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.


**Pros** - 
- You avoid tight coupling between the creator and the concrete products.
- You can move the product creation code into one place in the program, making the code easier to support (Single Responsibility Principle)
- You can introduce new types of products into the program without breaking existing client code (Open/Closed Principle).


**Cons** - 
- The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.