package org.section1.oops;

public class MethodOverloading {

    public void print(int a){
        System.out.println(a);
    }

//    public int print(int a){     results in error as the arguments are same
//        System.out.println(a);
//        return a;
//    }

    public void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        MethodOverloading m = new MethodOverloading();
        m.print(1);
        m.print("Hello");
    }

}
