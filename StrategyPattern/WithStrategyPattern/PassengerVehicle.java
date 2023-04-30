package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    //Needs drive capability as that of the Vehicle class
    PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
