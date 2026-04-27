package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.testng.AssertJUnit.assertEquals;

public class SpringUtilsTest {

    @Test
    public void TestNormalWord() {
        final String word = "hello";
        final String reversed = SpringUtils.reverseString(word);

        assertEquals("olleh", reversed);

    }

    @Test
    public void TestSentence() {
        final String sentence = "hello world";
        final String reversed = SpringUtils.reverseString(sentence);

        assertEquals("dlrow olleh", reversed);

    }

    @Test
    public void TestPalindrome() {
        final String palindrome = "racecar";
        final String reversed = SpringUtils.reverseString(palindrome);

        assertEquals("racecar", reversed);
    }


    @Test
    public void TestSingleChar() {
        final String singleChar = "a";
        final String reversed = SpringUtils.reverseString(singleChar);

        assertEquals("a", reversed);

    }

    @Test
    public void TestEmpty() {
        final String empty = "";
        final String reversed = SpringUtils.reverseString(empty);

        assertEquals("", reversed);

    }

    @Test
    public void TestUppercase(){
        final String sentenceUpper = "Hello World";
        final String reversed = SpringUtils.reverseString(sentenceUpper);

        assertEquals("dlroW olleH", reversed);

    }



}
