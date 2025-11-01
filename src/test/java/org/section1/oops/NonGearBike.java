package org.section1.oops;

public class NonGearBike extends BikeAbstractClass {

    public NonGearBike(){
        System.out.println("NonGearBike constructor");
    }

    @Override
    void run() {
        System.out.println(super.noOfGears);
    }

    @Override
    int speedUp() {
        return 0;
    }
    int noOfGears = 0;

    public static void main(String[] args){

      //  BikeAbstractClass bc = new BikeAbstractClass();  Error : 'BikeAbstractClass' is abstract; cannot be instantiated

        NonGearBike bike = new NonGearBike(); // Prints BikeAbstractClass constructor, and NonGearBike constructor
        // calls abstract class constructor first and then self
        System.out.println(bike.noOfGears);   // prints 0
        bike.run();   // print 5
        bike.changeGear();   // BikeAbstractClass changeGear


        BikeAbstractClass bike1 = new NonGearBike();// Prints BikeAbstractClass constructor, and NonGearBike constructor
        // calls abstract class constructor first and then self
        System.out.println(bike1.noOfGears);  // Prints 5 , from abstract class
        bike1.changeGear(); // BikeAbstractClass changeGear
        bike1.run(); // 5




    }


}
