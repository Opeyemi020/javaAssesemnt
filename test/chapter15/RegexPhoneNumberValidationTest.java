package chapter15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegexPhoneNumberValidationTest {

    @Test public void testPhoneNumberValidation(){
        RegexPhoneNumberValidation regexPhoneNumberValidation = new RegexPhoneNumberValidation();
        String phoneNumber = "08026811688";
        boolean result = regexPhoneNumberValidation.phoneNumberValidation(phoneNumber);
        assertTrue(result);
    }
    @Test public void testCanValidateNumbersWithCountryPrefix(){
        RegexPhoneNumberValidation regexPhoneNumberValidation = new RegexPhoneNumberValidation();
        String phoneNumber = "2348026811688";
        boolean result = regexPhoneNumberValidation.phoneNumberValidation(phoneNumber);
        assertTrue(result);    }
    @Test public void testCanValidateNumbersWithCountryPrefix2(){
        RegexPhoneNumberValidation regexPhoneNumberValidation = new RegexPhoneNumberValidation();
        String phoneNumber = "+2348026811688";
        boolean result = regexPhoneNumberValidation.phoneNumberValidation(phoneNumber);
        assertTrue(result);
    }
}







