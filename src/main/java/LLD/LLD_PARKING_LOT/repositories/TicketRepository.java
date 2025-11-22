package LLD.LLD_PARKING_LOT.repositories;

import LLD.LLD_PARKING_LOT.models.Ticket;
import com.sun.source.tree.Tree;

import javax.swing.text.html.Option;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class TicketRepository {

    private Map<Long, Ticket> tickets = new TreeMap<>();
    private Long lastSaveTicketId = 0L;

    public Ticket saveTicket(Ticket ticket){
        ticket.setId(++lastSaveTicketId);
        tickets.put(lastSaveTicketId, ticket);
        return ticket;
    }

}
