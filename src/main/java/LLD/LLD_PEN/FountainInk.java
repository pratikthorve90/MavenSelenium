package LLD.LLD_PEN;

public class FountainInk implements InkType{
    @Override
    public String getType() {
        return "Fountain Ink";
    }

    @Override
    public double getInkConsumptionRate() {
        return 1;
    }
}
