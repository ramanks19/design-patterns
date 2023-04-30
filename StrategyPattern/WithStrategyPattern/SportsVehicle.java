package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    //Sports Vehicle needs its own implementation of the drive method:
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
