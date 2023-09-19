//Concrete State Classes
package StatePattern;

public class GreenState implements TrafficLightState{

    @Override
    public void handle() {
        System.out.println("Traffic Light is GREEN. Go!");
    }
    
}