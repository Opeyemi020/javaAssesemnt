package chapter7;

import java.security.SecureRandom;

public class RollDie {

    public static void main(String[] args) {


        SecureRandom randomNumbers = new SecureRandom();
        int[] frequently = new int[7];

        for (int roll = 0; roll <= 60000000 ; roll++) {
            ++frequently[1 + randomNumbers.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequently");

        for (int face = 1; face < frequently.length; face++) {
            System.out.printf("%4d%10d%n", face , frequently[face]);
        }
    }
}
