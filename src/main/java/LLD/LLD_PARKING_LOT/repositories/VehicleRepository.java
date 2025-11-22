package LLD.LLD_PARKING_LOT.repositories;

import LLD.LLD_PARKING_LOT.models.Vehicle;
import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

// All vehicle crud operations

public class VehicleRepository {

    private Map<String, Vehicle> vehicles = new TreeMap<>();
    Long lastSaveVehicleId = 0L;

    public Optional<Vehicle> findVehicleById(String vehicleNumber){
        if(vehicles.containsKey(vehicleNumber)){
            return Optional.of(vehicles.get(vehicleNumber));
        }
        return Optional.empty();
    }

    public Vehicle saveNewVehicle(Vehicle vehicle){
        vehicle.setId(++lastSaveVehicleId);
        vehicles.put(vehicle.getVehicleNumber(), vehicle);
        return vehicle;
    }


}
