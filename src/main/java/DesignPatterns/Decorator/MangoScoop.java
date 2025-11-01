package DesignPatterns.Decorator;

// This is decorating entity, it can only wrap an ice cream cone
public class MangoScoop implements IceCreamCone {

    private IceCreamCone iceCreamCone;

    public MangoScoop(IceCreamCone iceCreamCone) {
        this.iceCreamCone = iceCreamCone;
    }

    @Override
    public int getCost() {
        return iceCreamCone.getCost() + 4;
    }

    @Override
    public String getContents() {
        return iceCreamCone.getContents() + " " +  "Mango";
    }
}
