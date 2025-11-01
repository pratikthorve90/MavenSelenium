package org.section1.oops;

public class MesaureTempratureCelcius implements InterfaceTemprature{

    int localVariableMesaureTempratureCelcius = 0;

    @Override
    public void mesaureTemp() {
        System.out.println("MesaureTempratureCelcius");
    }

    public void localMethodMesaureTempratureCelcius(){
        System.out.println("LocalMethodMesaureTempratureCelcius");
    }
}
