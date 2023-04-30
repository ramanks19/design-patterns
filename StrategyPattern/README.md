## Strategy Pattern

**A behavioral design pattern that defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable within that family. The pattern lets the algorithm vary independently from clients that use it.**

Here, In the sub-package WithoutStrategyPattern, the different types of vehicles inherit the drive() method from the parent Vehicle class. Each vehicle type has a different implementation of the drive() method. This leads to duplication of code and violation of the Single Responsibility Principle.

In the sub-package WithStrategyPattern, Strategy Pattern is implemented to resolve the above-mentioned issue. Instead of implementing the drive() method in each vehicle type, a DriveStrategy interface is created, which defines the drive() method. Two different implementations of the DriveStrategy interface are created: NormalDriveStrategy and SportsDriveStrategy.

The Vehicle class has a member variable driveStrategy of type DriveStrategy, and its drive() method is delegated to the drive() method of the driveStrategy object. The Vehicle class is constructed using a DriveStrategy object, using constructor injection.

Each vehicle type now has a constructor that calls the Vehicle constructor and passes an instance of the appropriate DriveStrategy object, which allows the vehicles to have different driving capabilities without duplicating code.

This approach follows the Open/Closed principle of SOLID design principles, which states that a software artifact (class, module, function, etc.) should be open for extension but closed for modification.

As an example, in the Main class, we have created an instance of SportsVehicle and call its drive() method, which will use the SportsDriveStrategy to perform its unique driving capability.


**When to use Strategy Pattern?**
It is useful when we have multiple algorithms that can be used to solve a problem, and we need to switch between these algorithms dynamically at runtime. The pattern allows us to encapsulate each algorithm as a separate class, and make them interchangeable within the same family of algorithms.