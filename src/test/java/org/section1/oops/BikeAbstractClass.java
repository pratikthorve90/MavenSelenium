package org.section1.oops;

public abstract class BikeAbstractClass {

    public int noOfGears = 5;

    public BikeAbstractClass(){
        System.out.println("BikeAbstractClass constructor");
    }

    abstract void run();

    abstract int speedUp();

    public void changeGear(){
        System.out.println("BikeAbstractClass changeGear");
    }
}
