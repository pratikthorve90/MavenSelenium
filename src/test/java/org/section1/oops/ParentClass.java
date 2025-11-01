package org.section1.oops;

public class ParentClass {

    private int id = 10;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public ParentClass(){
        System.out.println("ParentClass constructor called");
    }

    public void printStatus(){
        System.out.println("ParentClass printStatus called");
    }

    public void onlyParentMethod(){
        System.out.println("ParentClass onlyParentMethod called");
    }

}
