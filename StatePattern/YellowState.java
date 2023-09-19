//Concrete State Classes
package StatePattern;

public class YellowState implements TrafficLightState{

    @Override
    public void handle() {
        System.out.println("Traffic Light is Yellow. Prepare to stop or proceed with caution");
    }
    
}