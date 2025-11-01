package DesignPatterns.Decorator;

public class Customer {
    public static void main(String[] args) {

        // Now a customer want to create a ice cream cone with orange cone
        // Add 1 Vanilla and 2 Mango

        IceCreamCone iceCreamCone = new VanillaScoop(
                                        new MangoScoop(
                                                new VanillaScoop
                                                       (new OrangeCone())));


        System.out.println(iceCreamCone.getContents());   // Orange Cone Vanilla Mango Vanilla
        System.out.println(iceCreamCone.getCost());   // 18

        // Now if we want to add one more mango scoop. We pass the same object no new obj created

        IceCreamCone cone1 = new MangoScoop(iceCreamCone);

        System.out.println(cone1.getContents());   // Orange Cone Vanilla Mango Vanilla Mango
        System.out.println(cone1.getCost());   // 22

    }

}
