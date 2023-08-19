package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcTest {

    @Test
    public void switchOnAcTest() {
        AC myAc = new AC();
        assertFalse(myAc.isOn());
        myAc.toggleOn();
        assertEquals(true, myAc.isOn());
    }

    @Test
    public void switchOffAcTest() {
        AC myAc = new AC();
        myAc.toggleOn();
        assertTrue(myAc.isOn());
        myAc.toggleOn();
        assertFalse(myAc.isOn());
    }

    @Test
    public void increaseTemperatureTest() {
        AC myAc = new AC();
        myAc.toggleOn();
        assertTrue(myAc.isOn());
        myAc.getTemperature();
        assertEquals(16, myAc.getTemperature());
        myAc.increaseTemperature();
        assertEquals(17, myAc.getTemperature());
    }

    @Test
    public void decreaseTemperatureTestLessThan16() {
        AC myAc = new AC();
        myAc.toggleOn();
        assertTrue(myAc.isOn());
        myAc.getTemperature();
        assertEquals(16, myAc.getTemperature());
        myAc.decreaseTemperature();
        assertEquals(16, myAc.getTemperature());
    }

    @Test
    public void decreaseTemperatureTest() {
        AC myAc = new AC();
        myAc.toggleOn();
        assertTrue(myAc.isOn());
        myAc.getTemperature();
        assertEquals(16, myAc.getTemperature());
        myAc.increaseTemperature();
        myAc.increaseTemperature();
        myAc.decreaseTemperature();
        assertEquals(17, myAc.getTemperature());
    }

    @Test
    public void increaseTemperatureTestMoreThan30() {
        AC myAc = new AC();
        myAc.toggleOn();
        assertTrue(myAc.isOn());
        myAc.getTemperature();
        assertEquals(16, myAc.getTemperature());
        int count = 1;
        while (count <= 14) {
            myAc.increaseTemperature();
            count++;
        }
        myAc.increaseTemperature();
        assertEquals(30, myAc.getTemperature());
    }

}