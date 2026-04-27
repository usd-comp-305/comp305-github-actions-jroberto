package edu.sandiego.comp305;

public class SpringUtils {

    public static String reverseString(String forwardString){

        StringBuilder sbf = new StringBuilder(forwardString);

        String backwardString = "";

        backwardString = sbf.reverse().toString();
        return backwardString;
    }
}
