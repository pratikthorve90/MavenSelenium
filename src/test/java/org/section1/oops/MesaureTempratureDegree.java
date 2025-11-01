package org.section1.oops;

public class MesaureTempratureDegree implements InterfaceTemprature {

    public int localVariableMesaureTempratureDegree = 1;

    @Override
    public void mesaureTemp() {
        System.out.println("MesaureTempratureDegree.mesaureTemp()");
    }

    public void localMethodMesaureTempratureDegree(){
        System.out.println("localMethodMesaureTempratureDegree");
    }



}
