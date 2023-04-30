package StrategyPattern.WithStrategyPattern;

import StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    //OffRoadVehicle needs a drive() logic similar to that of SportsVehicle
    
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
