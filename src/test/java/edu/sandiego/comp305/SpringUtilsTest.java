package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.testng.AssertJUnit.assertEquals;

public class SpringUtilsTest {

    @Test
    public void TestNormalWord() {
        String word = "hello";
        SpringUtils reverser = new SpringUtils();
        String reversed = reverser.reverseString(word);

        assertEquals("olleh", reversed);

    }

    @Test
    public void TestSentence() {
        String sentence = "hello world";
        SpringUtils reverser = new SpringUtils();
        String reversed = reverser.reverseString(sentence);

        assertEquals("dlrow olleh", reversed);

    }

    @Test
    public void TestPalindrome() {
        String palindrome = "racecar";
        SpringUtils reverser = new SpringUtils();
        String reversed = reverser.reverseString(palindrome);

        assertEquals("racecar", reversed);
    }


    @Test
    public void TestSingleChar() {
        String singleChar = "a";
        SpringUtils reverser = new SpringUtils();
        String reversed = reverser.reverseString(singleChar);

        assertEquals("a", reversed);

    }

    @Test
    public void TestEmpty() {
        String empty = "";
        SpringUtils reverser = new SpringUtils();
        String reversed = reverser.reverseString(empty);

        assertEquals("", reversed);

    }

    @Test
    public void TestUppercase(){
        String sentenceUpper = "Hello World";
        SpringUtils reverser = new SpringUtils();
        String reversed = reverser.reverseString(sentenceUpper);

        assertEquals("dlroW olleH", reversed);

    }



}
