//Concrete State Classes
package StatePattern;

public class RedState implements TrafficLightState{

    @Override
    public void handle() {
        System.out.println("Traffic Light is RED. Stop!");
    }
    
}