package org.section1;

public class String1 {

    public static void main(String args[]){

        String s = "Pratik";
        String s1 = "Pratik";
        System.out.println(s);
        System.out.println(s1);
        s = "Thorve";
        System.out.println(s);
        System.out.println(s1);


        String p1 = "Pratik";
        String p2 = "Pratik";
        String p3 = new String("Pratik");
        String p4;

        System.out.println(p1 == p2); // True
        System.out.println(p1 == p3);  // False , as points to new location
      //  System.out.println(p1 == p4);  : Compilation error as the same

        System.out.println(p1.equals(p2));  // True , cause checks the sequence of characters to match
        System.out.println(p1.equals(p3));  // True, cause checks the sequence of characters to match
      //  System.out.println(p1.equals(p4));  : Compilation error as the same

        System.out.println(p1.compareTo(p2));  // 0
        System.out.println(p1.compareTo(p3 + "Test"));  // -4
        System.out.println(p1.compareTo(p3));  // 0











    }





}
