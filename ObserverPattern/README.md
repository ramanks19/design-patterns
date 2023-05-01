## Observer Pattern

**A behavioral design pattern that allows an object (the observable subject) to notify other objects (the observers) automatically when a change occurs. It allows for a flexible and decoupled way of notifying multiple observers of any changes that occur to an observable subject.**


Two key interfaces in Observer Design Pattern: 
- **Observable** is interface that defines an object that is observed. It maintains a list of its observers, called Observer objects, and provides methods to add or remove observers. The Observable object notifies its observers when its state changes, typically by calling a method on each observer.
- **Observer** is an interface that defines an object that receives notifications from an observable object. It has a single method, update(), which is called by the Observable object when its state changes.


Here, in the above code example, the StockObservable interface defines the methods that an observable subject should have, such as adding or removing observers, notifying all observers of any changes, setting a new stock count, and getting the current stock count. The IphoneObservableImpl class implements the StockObservable interface and has the observerList as a list of all observers interested in being notified.

The NotificationAlertObserver interface defines the method that an observer should have, which is the update method. The EmailAlertObserverImpl and MobileAlertObserverImpl classes implement the NotificationAlertObserver interface and have their specific implementation of the update method. In this case, EmailAlertObserverImpl sends an email to a specific email id, and MobileAlertObserverImpl sends a message to a specific user on the mobile.

The Store class acts as the client code, which creates the observable subject and three observers. It then adds all three observers to the list of observers interested in the observable subject. Finally, the observable subject's stock count is set to a value, which triggers the notification to all observers.