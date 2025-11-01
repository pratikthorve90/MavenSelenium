package LLD.LLD_PEN;

public class BallPen extends AbstractPen{

    public BallPen(Refill refill, String brand){
        super(refill,brand);
    }

    @Override
    public String getPenType() {
        return this.brand + " Ball Pen";
    }

}
