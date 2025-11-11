package LLD.LLD_PARKING_LOT.models;

import java.util.List;

public class ParkingFloor extends BaseModel{

    private List<ParkingSpot>  parkingSpots;
    private int floorNo;





    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }
}
