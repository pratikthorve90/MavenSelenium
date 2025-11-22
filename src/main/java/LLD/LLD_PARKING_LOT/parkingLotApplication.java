package LLD.LLD_PARKING_LOT;

import LLD.LLD_PARKING_LOT.controller.TicketController;
import LLD.LLD_PARKING_LOT.repositories.GateRepository;
import LLD.LLD_PARKING_LOT.repositories.ParkingLotRepository;
import LLD.LLD_PARKING_LOT.repositories.TicketRepository;
import LLD.LLD_PARKING_LOT.repositories.VehicleRepository;
import LLD.LLD_PARKING_LOT.services.TicketServices;
import LLD.LLD_PARKING_LOT.strategy.spotassignmentstrategy.RandomSpotAssignmentStrategy;
import LLD.LLD_PARKING_LOT.strategy.spotassignmentstrategy.SpotAssignmentStrategy;

public class parkingLotApplication {

    public static void main(String[] args) {

        GateRepository gateRepository = new GateRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        SpotAssignmentStrategy spotAssignmentStrategy = new RandomSpotAssignmentStrategy();

        TicketServices ticketServices = new TicketServices(gateRepository,vehicleRepository,spotAssignmentStrategy,ticketRepository,parkingLotRepository);

        TicketController ticketController = new TicketController(ticketServices);

        System.out.println("Application Started successfully");




    }


}
