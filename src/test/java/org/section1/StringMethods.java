package org.section1;

public class StringMethods {

    public static void main(String args[]){

        String s =  new String("Pratik");
        String s1 = "Thorve";
        System.out.println(s1.getClass());  // class java.lang.String
        System.out.println(s.getClass());   // class java.lang.String

        System.out.println(s.charAt(0)); // P
       // System.out.println(s.charAt(10)); // Index 10 out of bound for length 6
        char[] array1 = s.toCharArray();
        for(char c: array1){
            System.out.println(c);
        }

        System.out.println(array1.length);  // 6
        System.out.println(s.toLowerCase()); // pratik
        System.out.println(s); // Pratik

        System.out.println(s.toUpperCase());  // PRATIK
        System.out.println(s); // Pratik
        System.out.println(s.toCharArray()); // Pratik

        System.out.println(s.concat(" Brillant"));  // Pratik Brillant
        System.out.println(s);  // Pratik

        System.out.println(s.codePointAt(0)); //80 returns unicode character value of P
        System.out.println(s.compareToIgnoreCase("pratik")); //  0
        System.out.println(s.compareToIgnoreCase("ritik")); //  -2

        System.out.println(s.equalsIgnoreCase("pratik"));  // true
        System.out.println(s.equalsIgnoreCase("ritik"));  // false

        CharSequence chark = s.subSequence(0,2);
        System.out.println(chark); // Pr

        System.out.println(s.substring(0,2)); // Pr

        System.out.println(s.indexOf('Y'));  // -1
        System.out.println(s.indexOf('P'));  // 0
        System.out.println(s.indexOf("P"));  // 0
        System.out.println(s.indexOf("p"));  // -1

        System.out.println(s.join(" " , "Thorve", "Brilliant"));  // Thorve Brilliant
        System.out.println(s.replace("ratik", "Brilliant"));  // PBrilliant
        System.out.println(s.isEmpty());  // false , check for length
























    }

}
