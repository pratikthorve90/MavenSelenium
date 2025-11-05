package OOP.Polymorphism;

public class ChildOverRiding extends ParentOverRiding {

    public void print(){
        System.out.println("From child");
    }

    public void onlyChild(){
        super.onlyParent();      // Calling parent class implementation
        System.out.println("From onlyChild");
        super.onlyParent();   // Calling parent class implementation
        // Super can be any line , in case of constructor it needs to be line 1
    }

//    public int doSomething(){
//        // Compile time error : as parent class has same method with return Type String
//        // 'doSomething()' in 'Polymorphism. ChildOverRiding'
//        // clashes with 'doSomething()' in 'Polymorphism. ParentOverRiding'; attempting to use incompatible return type
//        return 1;
//    }

    public static void main(String[] args){
        ChildOverRiding child = new ChildOverRiding();
        child.onlyChild();  /// From onlyChild
        child.print();   /// From child
        child.onlyParent();  ///  onlyParent
        child.doSomething();  // Compile time error
       //  child.privateMethod() : Not allowed as private method.
    }

}
