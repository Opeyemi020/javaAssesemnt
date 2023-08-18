package chapter15;

public class RegexPhoneNumberValidation {


    public boolean phoneNumberValidation(String phoneNumber) {
        String regex = "((^234)[0-9]{10})|((^0)[0-9]{10})";
//        String regex = "\\d{11}";
        boolean result = phoneNumber.matches(regex);
        return result;
    }
}
