# Decorator Pattern

**A structural design pattern that allows behavior to be added to an individual object, without affecting the behavior of other objects from the same class. It is used to extend the functionality of an object in a flexible and dynamic way, without the need to create a subclass for every possible combination of behavior.**


**Steps to implement Decorator Pattern** - 
- Create an interface that defines the base component (object) that will have decorators. This interface should declare methods that the concrete component and decorators will implement.
- Create a concrete component class and define the base behavior in it.
- Create a base decorator class. It should have a field for storing a reference to a wrapped object. The field should be declared with the component interface type to allow linking to concrete components as well as decorators. The base decorator must delegate all work to the wrapped object.
- Create concrete decorators by extending them from the base decorator. A concrete decorator must execute its behavior before or after the call to the parent method (which always delegates to the wrapped object).
- The client code must be responsible for creating decorators and composing them in the way the client needs. 


Here, in this code we have a Pizza interface that defines the methods for getting the description (getDescription()) and cost (getCost()) of a pizza.Next, there is a concrete class PlainPizza that implements the Pizza interface which represents a plain pizza with no additional toppings. We define an abstract class called ToppingDecorator that implements the Pizza interface and contains a reference to a Pizza object. This allows us to add additional functionality to a Pizza object by decorating it with a ToppingDecorator.
There are three concrete ToppingDecorator classes: Cheese, Mushroom, and Pepperoni. These classes wrap around the existing Pizza object and add their own behavior to it.
Finally, the PizzaShop class contains the main method where the different types of pizzas are ordered, such as a plain pizza, a pizza with cheese, and a pizza with cheese and pepperoni. Here, the decorator pattern is used to add the toppings to the plain pizza.


**When to use it** - 
- Use the Decorator pattern when you need to be able to assign extra behaviors to objects at runtime without breaking the code that uses these objects.
- Use the pattern when it’s awkward or not possible to extend an object’s behavior using inheritance.


**Pros** - 
- You can extend an object’s behavior without making a new subclass.
- You can add or remove responsibilities from an object at runtime.
- You can combine several behaviors by wrapping an object into multiple decorators.
- You can divide a monolithic class that implements many possible variants of behavior into several smaller classes.


**Cons** - 
- It’s hard to remove a specific wrapper from the wrappers stack.
- It’s hard to implement a decorator in such a way that its behavior doesn’t depend on the order in the decorators stack.