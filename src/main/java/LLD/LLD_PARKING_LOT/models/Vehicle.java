package LLD.LLD_PARKING_LOT.models;

import LLD.LLD_PARKING_LOT.enums.Vehicle_Type;

public class Vehicle extends BaseModel{

    private Vehicle_Type vehicleType;
    private String vehicleNumber;

    public Vehicle_Type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle_Type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
