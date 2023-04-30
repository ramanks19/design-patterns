package StrategyPattern.WithoutStrategyPattern;

public class OffRoadVehicle extends Vehicle {
    //OffRoadVehicle needs a drive() logic similar to that of SportsVehicle
    @Override
    public void drive() {
        //different drive logic
        System.out.println("Sports Drive Capability");
    }
}
