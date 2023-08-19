package tdd;

public class AC {
    private boolean isOn;
    private int temperature;

    public void toggleOn() {
        if (!isOn) isOn = true;
        else isOn = false;


    }

    public boolean isOn() {
        return isOn;
    }

    public AC() {
        temperature = 16;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if (isOn && temperature < 30) temperature +=1;
    }

    public void decreaseTemperature() {
        if (isOn && temperature > 16) temperature -=1;

    }

}
