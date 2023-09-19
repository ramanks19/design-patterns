//Context Class
package StatePattern;

public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        //Initially, the traffic light is red
        currentState = new RedState();
    }

    public void setState(TrafficLightState state) {
        currentState = state;
    }

    public void change() {
        if (currentState instanceof RedState) {
            setState(new GreenState());
        } else if (currentState instanceof GreenState) {
            setState(new YellowState());
        } else if (currentState instanceof YellowState) {
            setState(new RedState());
        }
    }

    public void displayState() {
        currentState.handle();
    }
}
