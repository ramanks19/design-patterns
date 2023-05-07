# Factory Pattern

**A creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.**


The Factory Pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class.


Here, we define the Shape interface and two concrete implementations of the Shape interface: Rectangle and Circle. We also define the ShapeFactory class, which has a getShape() method that takes a shapeType parameter and returns a Shape object based on the shapeType parameter. Finally, we have the Main class, which demonstrates how to use the ShapeFactory class to create Rectangle and Circle objects. This example demonstrates how the Factory Pattern can be used to create objects without exposing the object creation logic to the client. The client only needs to know the shapeType parameter, and the ShapeFactory class handles the creation of the Shape objects. This can be useful when there are multiple types of objects that need to be created, and the creation logic is complex or subject to change.