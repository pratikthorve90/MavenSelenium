package DesignPatterns.Decorator;

// This is base entity
public class ChoclateCone implements IceCreamCone{
    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getContents() {
        return "Choclate Cone";
    }
}
