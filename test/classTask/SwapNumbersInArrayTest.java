package classTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNumbersInArrayTest {

    @Test
    void testThatNumberCanSwap(){
        SwapNumbersInArray array = new SwapNumbersInArray();
        int[] arr = {2,4,6,8,10};
       int[] actual = array.swapping(arr,2,3);
        int[] expected = {2,4,8,6,10};
        assertEquals(expected,actual);
    }

}