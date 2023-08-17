package chapter15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexPracticeTest {

    @Test
    public void testMatchesOne(){
        String pattern =  "AAA";
        String text = "AAA";

        boolean result = RegexPractice.findMatch(text, pattern);
        assertTrue(result);
    }
}