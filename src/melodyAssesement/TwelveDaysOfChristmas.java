package melodyAssesement;

import java.util.Scanner;

public class TwelveDaysOfChristmas {

    public static void main(String[] args) {

        for (int index = 1; index <= 12; index++) {

            System.out.println("On the");

            switch (index){
                case 1:
                    System.out.println("First Day of christmas");
                    break;
            }

            System.out.println("my true love gave to me");
            for (int count = 0; count <= 12; count++) {
                switch (count){
                    case 1:
                        System.out.println("A partridge in a pear tree");
                }
            }
        }



    }
}
