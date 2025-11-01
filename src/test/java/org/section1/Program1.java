package org.section1;

public class Program1 {

    public static void main(String[] args){

        // Hello 1 CR per annum 1Hello 1 CR per annum 2
        //Hello 1 CR per annum 3

        System.out.print("Hello 1 CR per annum 1");
        // prints and move to new line , so statement 3 is printed on new line
        System.out.println("Hello 1 CR per annum 2");
        System.out.print("Hello 1 CR per annum 3");
        System.out.println("------------------");

        System.out.println("The number of inputs received is : " + args.length);

        for(String s:args){
            System.out.println(s);
        }

        for(int i=0; i <args.length; i++){
            System.out.println(args[0]);
        }

        System.out.println(getData());

        Program1 obj1 = new Program1();

        System.out.println(obj1.getDataByObject());

    }

    public static int getData(){
        return 1;
    }

    public int getDataByObject(){
        return 2;
    }


}
