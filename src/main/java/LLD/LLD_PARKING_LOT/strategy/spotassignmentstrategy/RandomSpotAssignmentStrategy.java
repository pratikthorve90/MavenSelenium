package LLD.LLD_PARKING_LOT.strategy.spotassignmentstrategy;

import LLD.LLD_PARKING_LOT.enums.SpotStatus;
import LLD.LLD_PARKING_LOT.enums.Vehicle_Type;
import LLD.LLD_PARKING_LOT.exceptions.NoSpotAvailableException;
import LLD.LLD_PARKING_LOT.models.Gate;
import LLD.LLD_PARKING_LOT.models.ParkingFloor;
import LLD.LLD_PARKING_LOT.models.ParkingLot;
import LLD.LLD_PARKING_LOT.models.ParkingSpot;
import net.bytebuddy.implementation.bytecode.Throw;

import java.util.Optional;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy {


    @Override
    public Optional<ParkingSpot> findSpot(Vehicle_Type vehicleType, ParkingLot parkingLot, Gate gate) {

        for (ParkingFloor floor : parkingLot.getFloors()) {
            for (ParkingSpot spot : floor.getParkingSpots()) {
                if (spot.getSpotStatus() == SpotStatus.EMPTY &&
                        spot.getSupportedVehicleTypes().contains(vehicleType)) {
                    return Optional.of(spot);
                }
            }
        }
        return Optional.empty();
    }
}