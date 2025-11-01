package org.PlayGround;

import java.security.InvalidParameterException;

public class UserExam {

    private int mathsMarks;
    private int scienceMarks;

    public  int getMathsMarks(){
        return mathsMarks;
    }


    private UserExam(){};

    public static UserExamBuilder build(){
        return new UserExamBuilder();
    }


    public static class UserExamBuilder{

        private int mathsMarks;
        private int scienceMarks;

        public UserExamBuilder setMathsMarks(int mathsMarks){
            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks){
            this.scienceMarks = scienceMarks;
            return this;
        }

        public UserExam build(){
            if(this.mathsMarks < 35 || this.scienceMarks < 35){
                throw new InvalidParameterException("Failed cannot create userExam");
            }
            UserExam userExam = new UserExam();
            userExam.mathsMarks = this.mathsMarks;
            userExam.scienceMarks = this.scienceMarks;
            return userExam;
        }

    }

}
