package LLD.LLD_PEN;

public class GelPen extends AbstractPen{

    double nipSize ;

    public GelPen(Refill refill, String brand,double nipSize){
        super(refill, brand);
        this.nipSize = nipSize;

    }

    @Override
    public String getPenType() {
        return this.brand + " Gel Pen of Nip Size " + nipSize;
    }

}
