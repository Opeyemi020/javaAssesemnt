package classTask;

public class Isogram {

    public static boolean checkIsogram(String inputLetter) {
        String regex = "[a-zA-Z0-9]";
        String convert = inputLetter.replaceAll(regex, "");
        if (!convert.equals("")) return true;
        inputLetter = inputLetter.toLowerCase();
        for (int i = 0; i < inputLetter.length(); i++) {
            char currentChar = inputLetter.charAt(i);
            if (inputLetter.substring(i +1).indexOf(currentChar) != -1){
                return false;
            }
        }return true;
    }
}



