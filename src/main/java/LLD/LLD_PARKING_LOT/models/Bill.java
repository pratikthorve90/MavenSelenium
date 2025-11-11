package LLD.LLD_PARKING_LOT.models;

import LLD.LLD_PARKING_LOT.enums.PaymentStatus;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {

    private Date date;
    private Ticket ticket;
    private Operator operator;
    private int amount;
    private Gate gate;


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
