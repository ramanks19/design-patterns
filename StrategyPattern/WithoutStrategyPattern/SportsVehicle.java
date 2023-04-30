package StrategyPattern.WithoutStrategyPattern;

public class SportsVehicle extends Vehicle {
    //Sports Vehicle needs its own implementation of the drive method:
    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
