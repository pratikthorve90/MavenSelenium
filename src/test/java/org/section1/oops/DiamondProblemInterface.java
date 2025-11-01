package org.section1.oops;

public class DiamondProblemInterface implements DemoInterface1, DemoInterface2 {


    @Override
    public void printStatus() {
           DemoInterface1.super.printStatus();
        // OR
           DemoInterface2.super.printStatus();
        // OR
        System.out.println("This is custom");

    }

    public static void main(String[] args){
        DiamondProblemInterface d = new DiamondProblemInterface();
        d.printStatus();
    }

}
