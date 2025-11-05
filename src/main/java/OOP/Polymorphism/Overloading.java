package OOP.Polymorphism;

public class Overloading {
    // THIS IS COMPILE TIME POLYMORPHISM AS WHICH METHOD TO CALL IS FIXED AT COMPILE TIME
    // OVERLOADING : SAME METHOD WITH DIFFERENT SIGNATURE (TYPE / NUMBER OF PARAMETERS)
    // RETURN TYPE DOES NOT PLAY A ROLE

    public void print(){
        System.out.println("This is default print");
    }

    public void print(String toPrint){
        System.out.println(toPrint);
    }

//    public String print(String toPrint){  // Even if we change the return type it results in compile time error
//        return toPrint;
//    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.print();
        o.print("Pratik");
    }

}
