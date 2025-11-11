package LLD.LLD_PARKING_LOT.models;

import LLD.LLD_PARKING_LOT.enums.SpotStatus;
import LLD.LLD_PARKING_LOT.enums.Vehicle_Type;

import java.util.List;

public class ParkingSpot extends BaseModel{

    private int number;
    private List<Vehicle_Type> supportedVehicleTypes;
    private SpotStatus spotStatus;
    private Vehicle vehicle;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Vehicle_Type> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<Vehicle_Type> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public SpotStatus getSpotStatus() {
        return spotStatus;
    }

    public void setSpotStatus(SpotStatus spotStatus) {
        this.spotStatus = spotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
