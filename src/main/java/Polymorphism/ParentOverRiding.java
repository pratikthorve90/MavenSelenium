package Polymorphism;

public class ParentOverRiding {

    public void print(){
        System.out.println("From onlyParent");
    }

    public void onlyParent(){
        System.out.println("onlyParent");
    }

    public void doSomething(){
        System.out.println("doSomething");
    }

    private void privateMethod(){
        System.out.println("not visible to child");
    }

}
