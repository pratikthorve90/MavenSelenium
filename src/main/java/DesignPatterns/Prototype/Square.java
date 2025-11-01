package DesignPatterns.Prototype;

public class Square implements Prototype{

    public int side;

    public Square(int side) {
        this.side = side;
    }

    public Prototype clone() {
        return new Square(this.side);
    }

    public void draw(){
        System.out.println("Drawing Square of side "+this.side);
    }


}
