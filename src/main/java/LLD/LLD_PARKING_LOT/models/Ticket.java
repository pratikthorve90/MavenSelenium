package LLD.LLD_PARKING_LOT.models;

import LLD.LLD_PARKING_LOT.enums.Vehicle_Type;

import java.util.Date;

public class Ticket extends BaseModel{


    private ParkingSpot spot;
    private Date entry_date;
    private Gate gate;
    private Operator operator;
    private Vehicle vehicle;


    public ParkingSpot getSpot() {
        return spot;
    }

    public void setSpot(ParkingSpot spot) {
        this.spot = spot;
    }

    public Date getEntry_date() {
        return entry_date;
    }

    public void setEntry_date(Date entry_date) {
        this.entry_date = entry_date;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
