//Client Code
package StatePattern;

public class StatePatternExample {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        trafficLight.displayState(); //Initial state: RED

        trafficLight.change();
        trafficLight.displayState(); //Next state: GREEN

        trafficLight.change();
        trafficLight.displayState(); //Next state: YELLOW

        trafficLight.change();
        trafficLight.displayState(); //Next state: RED
    }
}
