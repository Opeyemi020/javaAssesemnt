package classTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsogramTest {
    @Test
    public void testIsogram(){
        Isogram isogram = new Isogram();
        boolean result = isogram.checkIsogram("The qick7t     %%g8[ brwn fx jumps ov lazy d_");
        assertTrue(result);

    }

}