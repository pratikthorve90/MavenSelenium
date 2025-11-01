package LLD.LLD_PEN;

public class AbstractPen implements IPen{

    protected Refill refill;
    protected String brand;

    public AbstractPen(Refill refill, String brand){
        this.refill = refill;
        this.brand = brand;
    }

    @Override
    public void write(String content) {
            refill.consumeInk();
    }

    @Override
    public void refill() {
        refill.refillInk();
    }

    @Override
    public double getInkLevel() {
        return refill.getInkLevel();
    }

    @Override
    public boolean canWrite() {
        return refill.canWrite();
    }

    @Override
    public String getPenType() {
       return brand;
    }
}
