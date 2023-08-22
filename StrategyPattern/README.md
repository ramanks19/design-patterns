## Strategy Pattern

**A behavioral design pattern that defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable within that family. The pattern lets the algorithm vary independently from clients that use it.**


**Steps to implement Strategy Pattern**
- In the context class, identify an algorithm that’s prone to frequent changes. It may also be a massive conditional that selects and executes a variant of the same algorithm at runtime.
- Declare the strategy interface common to all variants of the algorithm.
- One by one, extract all algorithms into their own classes. They should all implement the strategy interface.
- In the context class, add a field for storing a reference to a strategy object. Provide a setter for replacing values of that field. The context should work with the strategy object only via the strategy interface. The context may define an interface which lets the strategy access its data.
- Clients of the context must associate it with a suitable strategy that matches the way they expect the context to perform its primary job.


Here, In the sub-package WithoutStrategyPattern, the different types of vehicles inherit the drive() method from the parent Vehicle class. Each vehicle type has a different implementation of the drive() method. This leads to duplication of code and violation of the Single Responsibility Principle.

In the sub-package WithStrategyPattern, Strategy Pattern is implemented to resolve the above-mentioned issue. Instead of implementing the drive() method in each vehicle type, a DriveStrategy interface is created, which defines the drive() method. Two different implementations of the DriveStrategy interface are created: NormalDriveStrategy and SportsDriveStrategy.

The Vehicle class has a member variable driveStrategy of type DriveStrategy, and its drive() method is delegated to the drive() method of the driveStrategy object. The Vehicle class is constructed using a DriveStrategy object, using constructor injection.

Each vehicle type now has a constructor that calls the Vehicle constructor and passes an instance of the appropriate DriveStrategy object, which allows the vehicles to have different driving capabilities without duplicating code.

This approach follows the Open/Closed principle of SOLID design principles, which states that a software artifact (class, module, function, etc.) should be open for extension but closed for modification.

As an example, in the Main class, we have created an instance of SportsVehicle and call its drive() method, which will use the SportsDriveStrategy to perform its unique driving capability.


**When to use Strategy Pattern?**
- Use the Strategy pattern when you want to use different variants of an algorithm within an object and be able to switch from one algorithm to another during runtime.
- Use the Strategy when you have a lot of similar classes that only differ in the way they execute some behavior.
- Use the pattern to isolate the business logic of a class from the implementation details of algorithms that may not be as important in the context of that logic.
- Use the pattern when your class has a massive conditional statement that switches between different variants of the same algorithm.


**Pros**-
- You can swap algorithms used inside an object at runtime.
- You can isolate the implementation details of an algorithm from the code that uses it.
- You can replace inheritance with composition.
- Follows Open/Closed Principle as you can introduce new strategies without having to change the context.


**Cons**-
- If you only have a couple of algorithms and they rarely change, there’s no real reason to overcomplicate the program with new classes and interfaces that come along with the pattern.
- Clients must be aware of the differences between strategies to be able to select a proper one.
- A lot of modern programming languages have functional type support that lets you implement different versions of an algorithm inside a set of anonymous functions. Then you could use these functions exactly as you’d have used the strategy objects, but without bloating your code with extra classes and interfaces.