package org.PlayGround;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       UserExam  userExam = UserExam.build().setMathsMarks(80).setScienceMarks(78).build();
       System.out.println(userExam.getMathsMarks());

    }
}
