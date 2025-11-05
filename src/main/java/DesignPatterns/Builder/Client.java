package DesignPatterns.Builder;

public class Client {

    public static void main(String[] args) {

        UserExam exam1 ;
        try{
            // Object of UserExam is sucessfully created.
            // first create object of inner class
            // Assign value
            // Then call Builder to get validations done
            // Return the actual class object if the validations are good
            exam1 = UserExam.getBuilder()
                    .setName("Pratik")
                    .setEnglishMarks(90)
                    .setScienceMarks(50)
                    .setMathsMarks(40)
                    .build();

            // This results in : Something went wrong
            // This fail and the object of UserExam is not created
               exam1 = UserExam.getBuilder()
                    .setName("Pratik")
                    .setEnglishMarks(190)
                    .setScienceMarks(150)
                    .setMathsMarks(140)
                    .build();

        }catch (Exception e){
            System.out.println("Something went wrong");
        }


    }
}