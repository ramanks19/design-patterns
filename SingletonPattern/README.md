# Singleton Pattern

**A creational design pattern that lets you to ensure that a class has only one instance, while providing a global access point to this instance.**


**Steps to create a Singleton Class**
- **Private Constructor** - Make the constructor of the class private to prevent external instantiation.
- **Static Instance Variable** - Declare a private static instance variable of the class type within the class. This will hold the single instance of the class.
- **Static Method to Get Instance** - Provide a public static method that returns the instance of the class. If the instance doesn't exist, create it and then return it.


Here, in this example the DatabaseManager class is designed as a Singleton. It has a private static instance variable, which holds the single instance of the class. The constructor is also private to prevent direct instantiation from outside the class. Instead, the getInstance method provides a way to access the single instance. The method checks if an instance already exists; if not, it creates one and returns it.
The main method in the SingletonExample class demonstrates how you can use the Singleton to ensure that only one instance of the DatabaseManager is created regardless of the number of times you call the getInstance method. This ensures that you have a single point of control for managing database connections throughout your application.


**When to use it** - 
- Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.
- Use the Singleton pattern when you need stricter control over global variables.


**Pros**-
- You can be sure that a class has only a single instance.
- You gain a global access point to that instance.
- The singleton object is initialized only when it’s requested for the first time.


**Cons**-
- As the Singleton pattern creates a single instance of an object that is shared across the entire application, it can lead to global state and make it difficult to reason about the behavior of the application. This can make it harder to maintain and test the code, and can also make it more error-prone.
- Creates a tight coupling between the Singleton class and the rest of the application, it can make it harder to modify or extend the application. 
- The Singleton pattern can also be problematic in multithreaded environments, where multiple threads may try to access the Singleton instance simultaneously leading to race conditions and other synchronization issues, which can be difficult to debug and fix.
- The Singleton pattern can also limit the scalability of an application, because it creates a single point of contention for resources.