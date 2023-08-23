# Adapter Pattern

**A structural design pattern that allows objects with incompatible interfaces to collaborate. It converts the interface of one class into another interface that clients expect.**


**Steps to implement Adapter pattern -**
- Identify the target interface (the one your client expects to work with) and the interface of the class you want to adapt (the one you need to make compatible).
- Define the target interface that the client code expects to interact with. This is the interface that the adapter will implement.
- Create the Adaptee Class: Implement the class with the interface that needs to be adapted. This is the class that the adapter will wrap and adapt.
- Create the Adapter Class: Create a class that implements the target interface. This class will wrap the adaptee object and implement the methods of the target interface by calling methods of the adaptee.
- Client Code: Use the adapter class in your client code, treating it as if it's an instance of the target interface. The adapter will internally call the methods of the adaptee to provide the expected functionality.


Here, in the given example to create an adapter that allows the micro USB accessories to work with the USB-C port of the smartphone we have:
- The UsbCDevice interface to represent the modern USB-C interface.
- The MicroUsbDevice class to represent the older micro USB device.
- The MicroUsbToUsbCAdapter class to implement the UsbCDevice interface and wraps the MicroUsbDevice, adapting it to the modern USB-C interface.
- The client code demonstrates how the adapter allows the micro USB device to work with the USB-C interface.


**When to use it?**
- Use the Adapter class when you want to use some existing class, but its interface isn’t compatible with the rest of your code.
- Use the pattern when you want to reuse several existing subclasses that lack some common functionality that can’t be added to the superclass.


**Pros -**
- You can separate the interface or data conversion code from the primary business logic of the program (Single Responsibility Principle).
- You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface (Open/Closed Principle).


**Cons -**
- The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code.