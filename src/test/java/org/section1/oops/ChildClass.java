package org.section1.oops;

public class ChildClass extends ParentClass {

    public int id = 1000;

    public ChildClass(){
        super();
        System.out.println("ChildClass constructor called");
    }

    public void printStatus(){
        System.out.println("ChildClass printStatus called");
    }

    public void onlyChildMethod(){
        System.out.println("ChildClass onlyChildMethod called");
    }

    public static void main(String[] args){

        ChildClass c = new ChildClass(); // ParentClass constructor called ChildClass constructor calle
        System.out.println(c.id);  // 1000
        System.out.println(c.getId());  // 10
        c.printStatus(); // ChildClass printStatus called , call the child class method
        c.onlyParentMethod(); // ParentClass onlyParentMethod called
        c.onlyChildMethod(); // ChildClass onlyChildMethod called

        ParentClass p = new ChildClass();
        System.out.println(p.getId());  // 10
        c.onlyChildMethod();  // ChildClass onlyChildMethod called
        c.onlyParentMethod();  // ParentClass onlyParentMethod called
        p.printStatus();  // ChildClass printStatus called


    }



}
