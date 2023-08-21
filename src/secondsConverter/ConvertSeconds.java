package secondsConverter;

import java.util.Date;

public class ConvertSeconds {
    public static void main(String[] args) {

    }
    int year;
    int month;
    int day;


    public ConvertSeconds(long inputSecond) {
        Date date = new Date(inputSecond);
        this.month = date.getMonth();
        this.year = date.getYear();
        this.day = date.getDate();
        ConvertSeconds convertSeconds = new ConvertSeconds(inputSecond);
    }
    
}
