package LLD.LLD_PARKING_LOT.models;

import LLD.LLD_PARKING_LOT.enums.PaymentMode;
import LLD.LLD_PARKING_LOT.enums.PaymentStatus;

public class Payment extends BaseModel{

    private int amount;
    private String ref_id;
    private Bill bill;
    private PaymentMode mode;
    private PaymentStatus paymentStatus;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRef_id() {
        return ref_id;
    }

    public void setRef_id(String ref_id) {
        this.ref_id = ref_id;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
