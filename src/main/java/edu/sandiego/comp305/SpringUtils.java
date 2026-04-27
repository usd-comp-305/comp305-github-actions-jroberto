package edu.sandiego.comp305;

public class SpringUtils {

    private SpringUtils() {}

    public static String reverseString(final String forwardString){

        final StringBuilder sbf = new StringBuilder(forwardString);

        String backwardString = "";

        backwardString = sbf.reverse().toString();
        return backwardString;
    }
}
