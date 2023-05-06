# Decorator Pattern

**A structural design pattern that allows behavior to be added to an individual object, without affecting the behavior of other objects from the same class. It is used to extend the functionality of an object in a flexible and dynamic way, without the need to create a subclass for every possible combination of behavior.**


**Why do we need it?**
- To avoid **class explosion** (having a large number of classes that are created by combining multiple variations of a feature or functionality).

Here, in this code we have a Pizza interface that defines the methods for getting the description (getDescription()) and cost (getCost()) of a pizza.Next, there is a concrete class PlainPizza that implements the Pizza interface which represents a plain pizza with no additional toppings. We define an abstract class called ToppingDecorator that implements the Pizza interface and contains a reference to a Pizza object. This allows us to add additional functionality to a Pizza object by decorating it with a ToppingDecorator.
There are three concrete ToppingDecorator classes: Cheese, Mushroom, and Pepperoni. These classes wrap around the existing Pizza object and add their own behavior to it.
Finally, the PizzaShop class contains the main method where the different types of pizzas are ordered, such as a plain pizza, a pizza with cheese, and a pizza with cheese and pepperoni. Here, the decorator pattern is used to add the toppings to the plain pizza.