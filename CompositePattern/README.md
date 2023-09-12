# Composite Pattern

**A structural design pattern that allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.**


**Steps to implement Factory Pattern**-
- Define an interface that declares the common operations that both leaf and composite objects must implement. This interface should capture the "component" role in the hierarchy.
- Implement leaf classes that represent the individual objects in the hierarchy. These classes will implement the component interface and represent the simplest building blocks.
- Implement composite classes that also implement the component interface. These are responsible for delegating operations to their child classes.
- Define common operations that make sense for both leaf and composite objects. These operations can be defined in the component interface and implemented in both leaf and composite classes.
- In composite classes, provide methods to add, remove, and access child components. These methods are used to build and manipulate the hierarchy.
- In composite classes, implement operations by iterating over and applying the same operation to all child components. This recursive approach allows operations to be applied uniformly across the hierarchy.
- In the client code, work with objects through the component interface. Clients treat individual objects and compositions of objects uniformly, without needing to know the specific type of object they are dealing with.


Here, we have defined the Graphic interface which represents the component interface, which both leaf and composite objects must implement. It defines the draw method. Circle and Rectangle are leaf classes that implement the Graphic interface and represent individual shapes. CompositeGraphic is the composite class that also implements the Graphic interface. It can contain other Graphic objects, including both individual shapes and other composite shapes. In the client code, we create individual shapes (circles and rectangles) and a composite shape (composite graphic). We add individual shapes to the composite, and when we call draw on the composite, it recursively calls draw on its children, allowing us to draw both individual and composite shapes.


**When to use it** - 
- Use the Composite pattern when you have to implement a tree-like object structure.
- Use the pattern when you want the client code to treat both simple and complex elements uniformly.


**Pros** - 
- You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
- Open/Closed Principle. You can introduce new element types into the app without breaking the existing code, which now works with the object tree.


**Cons** - 
- It might be difficult to provide a common interface for classes whose functionality differs too much. In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend.