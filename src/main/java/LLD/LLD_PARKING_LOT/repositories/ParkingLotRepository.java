package LLD.LLD_PARKING_LOT.repositories;

import LLD.LLD_PARKING_LOT.models.Gate;
import LLD.LLD_PARKING_LOT.models.ParkingLot;
import LLD.LLD_PARKING_LOT.models.ParkingSpot;
import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {

private Map<Long, ParkingLot> parkingLots = new TreeMap<>();

    public ParkingLot getParkingLot(Gate gate){
        for(ParkingLot parkingLot: parkingLots.values()){
            if(parkingLot.getGates().contains(gate)){
                return parkingLot;
            }
        }
        return null;
    }

}
