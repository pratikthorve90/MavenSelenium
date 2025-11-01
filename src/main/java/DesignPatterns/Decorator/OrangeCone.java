package DesignPatterns.Decorator;

// This is base entity
public class OrangeCone implements IceCreamCone {
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getContents() {
        return "Orange Cone";
    }
}
