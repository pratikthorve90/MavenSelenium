package LLD.LLD_PEN;

public class BallPointInk implements InkType{

    @Override
    public String getType() {
        return "Ball Point";
    }

    @Override
    public double getInkConsumptionRate() {
        return 0.5;
    }
}
