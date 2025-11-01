package org.section1;

public class LoopsExercise {

    public static void main(String[] args){


        // Print in following format
        // 1 2 3 4
        // 5 6 7
        // 8 9
        // 10

        int value = 1;

        for(int i=0; i<4; i++){
            for(int j=4; j>i;j--){
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }

        System.out.println();

        // Print in following format
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10

        int value1 = 1;
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){{
                System.out.print(value1+" ");
                value1++;
            }}
            System.out.println();
        }










    }



}
