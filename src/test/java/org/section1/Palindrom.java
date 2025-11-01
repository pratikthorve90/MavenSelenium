package org.section1;

public class Palindrom {

    public static void main(String[] args){

        System.out.println(isPalindrome("MADAMA"));
        System.out.println(isPalindrome("PRATIK"));

    }

    public static boolean isPalindrome(String s) {

        boolean result = false;

        if(s.length()<2){
            return false;
        }
        else{
            int i =0 ,j = s.length()-1;
            while(i<j){
                if(s.charAt(i) == s.charAt(j)){
                    i++;
                    j--;
                }
                else{
                    return false;
                }

                result = true;

            }
        }
        return result;
    }
}
