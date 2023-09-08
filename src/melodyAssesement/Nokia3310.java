package melodyAssesement;

import java.util.Scanner;

public class Nokia3310 {

    public static void main(String[] args) {

        Scanner input =
                new Scanner(System.in);

        String listOfMenuFunction =
                """
               =======================
                LIST OF MENU FUNCTIONS
               =======================       \s
               1-> Phonebook
               2-> Messages
               3-> Chat
               4-> CallRegister
               5-> Tones
               6-> Settings
               7-> Call divert
               8-> Games
               9-> Calculator
               10-> Reminders
               11-> Clock
               12-> profiles
               13-> SIM services
               ======================""";

        int option = input.nextInt();
        switch (option){
            case 1-> phonebook();
        }
    }

    private static void phonebook() {
    
    }
}
