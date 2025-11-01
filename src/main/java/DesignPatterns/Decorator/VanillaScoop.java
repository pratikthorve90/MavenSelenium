package DesignPatterns.Decorator;

// This is decorating entity, it can only wrap an ice cream cone
public class VanillaScoop implements IceCreamCone{

    private IceCreamCone iceCreamCone;

    public VanillaScoop(IceCreamCone cone){
        this.iceCreamCone = cone;
    }

    @Override
    public int getCost() {
        return iceCreamCone.getCost() +  2;
    }

    @Override
    public String getContents() {
        return iceCreamCone. getContents() + " " +  "Vanilla";
    }
}
