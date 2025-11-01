package org.section1;

public class Loops1 {

    public static void main(String[] args){

        if(true)
            System.out.println("true");

        if(true){
            System.out.println("true");
        }

        if(true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(true)
            System.out.println("true");
        else
            System.out.println("false");


        for(int i=0;i < 10;i++){
            System.out.print(i + " ");
        }

        for(int i=0;i < args.length; i++){
            System.out.print(args[i] + " ");
        }

        String[] mylist = {"Pratik", "Will", "Score", "Big"};
        for(String s:mylist ){
            System.out.print(s + " ");
        }

        int i =0;
        while(i < 10){
            System.out.print(i + " ");
            i++;
        }

        int j =0;
        do{
            System.out.print(j + " ");
            j++;
        }while(j < 10);



    }


}
