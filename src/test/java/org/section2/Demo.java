package org.section2;

public class Demo {

    String name;

    Demo(String name){
        this.name = name;
    }

    Demo(){
        // Default constructor that we wrote because we created a parameterized constructor
        // Not needed if we are planning to use the parameterized everytime
    }

//    Demo(Demo d){
//        name = d.name;   // this is shallow copy
//    }

    Demo(Demo d){
        name = new String(d.name);  // this is deep copy
    }

    public static void main(String[] args){


    }

}
