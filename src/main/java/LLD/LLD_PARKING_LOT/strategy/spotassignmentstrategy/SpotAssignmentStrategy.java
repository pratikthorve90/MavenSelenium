package LLD.LLD_PARKING_LOT.strategy.spotassignmentstrategy;

import LLD.LLD_PARKING_LOT.enums.Vehicle_Type;
import LLD.LLD_PARKING_LOT.models.Gate;
import LLD.LLD_PARKING_LOT.models.ParkingLot;
import LLD.LLD_PARKING_LOT.models.ParkingSpot;

import java.util.Optional;

public interface SpotAssignmentStrategy {

    public Optional<ParkingSpot> findSpot(Vehicle_Type vehicleType, ParkingLot parkingLot, Gate gate);

}
