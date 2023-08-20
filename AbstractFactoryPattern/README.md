# Abstract Factory Pattern

**A creational design pattern that lets you produce families of related objects without specifying their concrete classes.**


**Steps to implement the Abstract Factory Pattern**
- **Declare Abstract Products** - Create interfaces for each distinct but related product in the product family. Each interface should declare methods that define the behavior of the products.
- **Implement Concrete Products** - Create concrete classes that implement the abstract product interfaces. Each concrete product class represents a specific variant of a product.
- **Declare Abstract Factory** - Create an abstract factory interface that declares methods for creating each of the abstract products. This interface is responsible for creating the entire family of related products.
- **Implement Concrete Factories** - Create concrete factory classes that implement the abstract factory interface. Each concrete factory corresponds to a specific variant of products and creates only those product variants. 
- **Client Code** - The client code uses the abstract factory and product interfaces to create and work with products. The client is decoupled from specific product variants and factories.


Here, we have defined abstract product interfaces (Chair, Sofa, CoffeeTable) for the furniture items. We then implemented concrete product classes for different variants of these items (ModernChair, ModernSofa, ModernCoffeeTable, VictorianChair, VictorianSofa, VictorianCoffeeTable).
The FurnitureFactory interface represents the abstract factory, with methods to create each type of furniture. We then implemented concrete factory classes (ModernFurnitureFactory and VictorianFurnitureFactory) that create products corresponding to their respective styles.
The FurnitureShopSimulator demonstrates how to use the abstract factory to create furniture items of different styles. Depending on the factory chosen, it creates furniture items of either modern or Victorian style.
This implementation follows the Abstract Factory Pattern, allowing you to create families of related products (furniture items) with different variants (styles) while keeping the client code decoupled from the actual implementations.


**Pros**
- You can be sure that the products you’re getting from a factory are compatible with each other.
- You avoid tight coupling between concrete products and client code, thereby following Single Responsibility Principle.
- You also follows Open-Closed Principle by introducing new variants of products without breaking existing client code.


**Cons**
- The code may become more complicated than it should be, since a lot of new interfaces and classes are introduced along with the pattern.

