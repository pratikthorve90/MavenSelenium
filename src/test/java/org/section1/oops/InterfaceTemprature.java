package org.section1.oops;

public interface InterfaceTemprature {

    int interfaceTempratureValue = 0;

    default void localInterfaceMethod(){
        System.out.println("I am in intefac");
    }

    public void mesaureTemp();

}
