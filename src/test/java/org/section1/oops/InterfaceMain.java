package org.section1.oops;

public class InterfaceMain {

    public static void main(String[] args){

      //  InterfaceTemprature it = new InterfaceTemprature(); // Compile time error , cannot create object of interface

      MesaureTempratureCelcius mc = new MesaureTempratureCelcius();
      System.out.println(mc.localVariableMesaureTempratureCelcius);
      mc.mesaureTemp();
      mc.localMethodMesaureTempratureCelcius();
      mc.localInterfaceMethod();
      // mc.interfaceTempratureValue;  // Error cannot access

      InterfaceTemprature it = new MesaureTempratureCelcius();
    //  System.out.println(it.localVariableMesaureTempratureCelcius);
      it.mesaureTemp();
   //   it.localMethodMesaureTempratureCelcius();
      it.localInterfaceMethod();
      System.out.println(it.interfaceTempratureValue);





    }



}
