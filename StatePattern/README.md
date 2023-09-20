# State Pattern

**A behavioral design pattern that allows an object to alter its behavior when its internal state changes.**


**Steps to implement State Pattern**
- **Identify the Context:** Identify the class that will have its behavior controlled by changing states.
- **Define the State Interface:** Create an interface (or an abstract class) that defines the methods that represent the behavior of different states. Each concrete state class will implement this interface.
- **Create Concrete State Classes:** Implement concrete classes that represent different states and implement the methods defined in the state interface. These classes will encapsulate the behavior associated with each state.
- **Implement the Context Class:** In the context class, include a reference to the current state object and methods to set and get the state. The context class will delegate its behavior to the current state object.
- **Use the State Objects:** In the client code, create instances of the concrete state classes and set them as the state of the context object. The context object will behave differently depending on its current state.


Here, in this example:
- The TrafficLightState interface represents the state of the traffic light.
- Concrete state classes (RedState, YellowState, and GreenState) implement the TrafficLightState interface and define behavior for each state.
- The TrafficLight class represents the context that can change its state.
- The change() method simulates the transition of the traffic light states.
- The displayState() method displays the current state's behavior.


**When to use it** - 
- Use the State pattern when you have an object that behaves differently depending on its current state, the number of states is enormous, and the state-specific code changes frequently.
- Use the pattern when you have a class polluted with massive conditionals that alter how the class behaves according to the current values of the class’s fields.
- Use State when you have a lot of duplicate code across similar states and transitions of a condition-based state machine.


**Pros**-
- Single Responsibility Principle. Organize the code related to particular states into separate classes.
- Open/Closed Principle. Introduce new states without changing existing state classes or the context.
- Simplify the code of the context by eliminating bulky state machine conditionals.


**Cons**-
- Applying the pattern can be overkill if a state machine has only a few states or rarely changes.