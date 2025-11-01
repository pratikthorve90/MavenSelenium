package DesignPatterns.Prototype;

public class Circle implements Prototype{

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this.radius);  // Copy object
    }

    public void draw(){
        System.out.println("Circle Drawn of radius" + this.radius);
    }
}
