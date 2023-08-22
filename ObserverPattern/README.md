## Observer Pattern

**A behavioral design pattern that allows an object (the observable subject) to notify other objects (the observers) automatically when a change occurs. It allows for a flexible and decoupled way of notifying multiple observers of any changes that occur to an observable subject.**


Two key interfaces in Observer Design Pattern: 
- **Observable** is interface that defines an object that is observed. It maintains a list of its observers, called Observer objects, and provides methods to add or remove observers. The Observable object notifies its observers when its state changes, typically by calling a method on each observer.
- **Observer** is an interface that defines an object that receives notifications from an observable object. It has a single method, update(), which is called by the Observable object when its state changes.


**Steps to implement Observer Pattern** - 
- Create an interface that represents the subject (observable) object. This interface should include methods to register, unregister, and notify observers.
- Create an interface that represents the observer. This interface should include a method that the subject will call to update the observer.
- Create a concrete class that implements the Subject interface. This class will maintain a list of observers, provide methods to manage observers, and notify them when the state changes.
- Create one or more concrete classes that implement the Observer interface. These classes will update their state based on the information received from the subject.
- In the client code, create instances of the concrete subject and observer classes, register observers with the subject, and update the subject's state to notify the observers.


Here, in the above code example, the StockObservable interface defines the methods that an observable subject should have, such as adding or removing observers, notifying all observers of any changes, setting a new stock count, and getting the current stock count. The IphoneObservableImpl class implements the StockObservable interface and has the observerList as a list of all observers interested in being notified.

The NotificationAlertObserver interface defines the method that an observer should have, which is the update method. The EmailAlertObserverImpl and MobileAlertObserverImpl classes implement the NotificationAlertObserver interface and have their specific implementation of the update method. In this case, EmailAlertObserverImpl sends an email to a specific email id, and MobileAlertObserverImpl sends a message to a specific user on the mobile.

The Store class acts as the client code, which creates the observable subject and three observers. It then adds all three observers to the list of observers interested in the observable subject. Finally, the observable subject's stock count is set to a value, which triggers the notification to all observers.


**When to use it** - 
- Use the Observer pattern when changes to the state of one object may require changing other objects, and the actual set of objects is unknown beforehand or changes dynamically.
- Use the pattern when some objects in your app must observe others, but only for a limited time or in specific cases.


**Pros** - 
- You can introduce new subscriber classes without having to change the publisher’s code (and vice versa if there’s a publisher interface) - Open/Closed Principle.
- You can establish relations between objects at runtime.


**Cons** - 
- Subscribers are notified in random order.