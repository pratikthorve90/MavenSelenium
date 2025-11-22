package LLD.LLD_PARKING_LOT.controller;

import LLD.LLD_PARKING_LOT.dto.GenerateTicketRequestDTO;
import LLD.LLD_PARKING_LOT.dto.GenerateTicketResponseDTO;
import LLD.LLD_PARKING_LOT.enums.ResponseStatus;
import LLD.LLD_PARKING_LOT.enums.Vehicle_Type;
import LLD.LLD_PARKING_LOT.exceptions.InvalidGateException;
import LLD.LLD_PARKING_LOT.exceptions.NoSpotAvailableException;
import LLD.LLD_PARKING_LOT.models.*;
import LLD.LLD_PARKING_LOT.services.TicketServices;

public class TicketController {

        private TicketServices ticketServices;

        public TicketController(TicketServices ticketServices){
            this.ticketServices = ticketServices;
        }

        public GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO request)  {

            String vehicleNumber= request.getVehicleNumber();
            Vehicle_Type vehicleType = request.getVehicleType();
            Long gateId = request.getGateId();
            GenerateTicketResponseDTO responseDTO = new GenerateTicketResponseDTO();
            Ticket ticket;
            try{
                ticket = ticketServices.generateTicket(vehicleNumber, vehicleType, gateId);
            } catch (InvalidGateException e) {
                responseDTO.setResponseStatus(ResponseStatus.FAILURE);
                responseDTO.setMessage("Invalid Gate ID provided please recheck GateID");
                return responseDTO;
            } catch (NoSpotAvailableException e) {
                responseDTO.setResponseStatus(ResponseStatus.FAILURE);
                responseDTO.setMessage("No spot available to park");
                return responseDTO;
            }


            responseDTO.setOperatorName(ticket.getOperator().getName());
            responseDTO.setSpotNumber(ticket.getSpot().getNumber());
            responseDTO.setTicketId(ticket.getId());
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDTO;
        }
}
