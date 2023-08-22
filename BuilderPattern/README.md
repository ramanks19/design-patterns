# Builder Pattern

**A creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.**


**Steps to implement Builder Pattern**
- Start with the Builder interface which define the common construction steps for building all available product representations.
- Create a Concrete Builder class for each of the product representations and implement their construction steps. Don’t forget about implementing a method for fetching the result of the construction. 
- Create a Director class that may encapsulate various ways to construct a product using the same builder object.
- Create the Client class which will create both the builder and the director objects. Before construction starts, the client must pass a builder object to the director. Usually, the client does this only once, via parameters of the director’s class constructor. The director uses the builder object in all further construction. There’s an alternative approach, where the builder is passed to a specific product construction method of the director.


Here, in this example, we have the Computer class representing the complex object we want to build. We also have the ComputerBuilder interface that declares methods for setting different components of the computer. The GamingComputerBuilder and OfficeComputerBuilder are concrete builder implementations that implement the ComputerBuilder interface to build gaming and office computers, respectively.
The ComputerAssembler class acts as the director, responsible for assembling the computer using a specific builder. The client code demonstrates how you can use the Builder Pattern to create different configurations of computers with ease.


**When to use it** - 
- Use the Builder pattern to get rid of a “telescoping constructor”.
- Use the Builder pattern when you want your code to be able to create different representations of some product (for example, stone and wooden houses).
- Use the Builder to construct Composite trees or other complex objects.


**Pros**-
- You can construct objects step-by-step, defer construction steps or run steps recursively.
- You can reuse the same construction code when building various representations of products.
- Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.


**Cons**-
- The overall complexity of the code increases since the pattern requires creating multiple new classes.