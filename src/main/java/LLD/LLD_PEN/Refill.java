package LLD.LLD_PEN;

public class Refill {

    private String color;
    private InkType inkType;
    private Double inkLevel;
    private final double maxCapacity = 100.00;

    public Refill(String color, InkType inkType, Double inkLevel) {
        this.color = color;
        this.inkType = inkType;
        this.inkLevel = inkLevel;
    }

    public boolean canWrite(){
        return inkLevel > 0;
    }

    public void consumeInk(){
        inkLevel -= inkType.getInkConsumptionRate();
    }

    public void refillInk(){
        inkLevel = maxCapacity;
    }

    public double getInkLevel(){
        return inkLevel;
    }

    public InkType getInkType(){
        return inkType;
    }




}
