package LLD.LLD_PARKING_LOT.services;

import LLD.LLD_PARKING_LOT.enums.Vehicle_Type;
import LLD.LLD_PARKING_LOT.exceptions.InvalidGateException;
import LLD.LLD_PARKING_LOT.models.*;
import LLD.LLD_PARKING_LOT.repositories.GateRepository;
import LLD.LLD_PARKING_LOT.repositories.TicketRepository;
import LLD.LLD_PARKING_LOT.repositories.VehicleRepository;
import LLD.LLD_PARKING_LOT.strategy.spotassignmentstrategy.SpotAssignmentStrategy;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.Optional;

public class TicketServices {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private TicketRepository ticketRepository;

    public TicketServices(GateRepository gateRepository, VehicleRepository vehicleRepository, SpotAssignmentStrategy spotAssignmentStrategy, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.spotAssignmentStrategy =  spotAssignmentStrategy;
        this.ticketRepository = ticketRepository;
    }

    public Ticket generateTicket(String vehicleNumber, Vehicle_Type vehicleType, Long gateId) throws InvalidGateException {

        Ticket ticket = new Ticket();
        ticket.setEntry_date(new Date());
        Vehicle vehicle ;

        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);

        if(gateOptional.isEmpty()){
            throw new InvalidGateException("Gate not found f ro id " + gateId);
        }

        Gate gate = gateOptional.get();
        ticket.setGate(gate);

        Operator operator = gate.getOperator();
        ticket.setOperator(operator);

        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleById(vehicleNumber);
        if(vehicleOptional.isEmpty()){
            // Create new Vehicle if it does not exist , do not throw error
            vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setVehicleNumber(vehicleNumber);
            vehicleRepository.saveNewVehicle(vehicle);
        }
        else {
            vehicle = vehicleOptional.get();
        }
        ticket.setVehicle(vehicle);

        ParkingSpot parkingSpot = spotAssignmentStrategy.findSpot();
        ticket.setSpot(parkingSpot);

        return ticketRepository.saveTicket(ticket); // return after save in DB , this will also have ID attribute return from DB table ID
    }


}
