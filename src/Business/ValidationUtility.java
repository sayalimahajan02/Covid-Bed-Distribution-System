/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.regex.Pattern;

/**
 *
 * @author aishwarya
 */
public class ValidationUtility {

    /**
     *
     * @param text
     * @return Valid only alphabets and spaces between them
     */
    public static boolean isNameValid(String text) {
        String regex = "^[a-zA-Z].*[\\s\\.]*$";
        return text.matches(regex);
    }

    /**
     *
     * @param text
     * @return Valid between 3-30 characters, only alphabets
     */
    public static boolean isUserNameValid(String text) {
        String regex = "^[A-Za-z]\\w{2,29}$";
        return text.matches(regex);
    }

    /**
     *
     * @param text
     * @return Valid between 3-20 characters. Lower case, upper case, digit and
     * a special character should occur once.
     */
    public static boolean isPasswordValid(String text) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{2,20}$";
        return text.matches(regex);
    }

    public static boolean isEmailAddressValid(String text) {
        Pattern regex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        return regex.matcher(text).matches();
    }

    /**
     *
     * @param text
     * @return Valid formats: 1) 12345 2) 12345-6789 3) 12345 6789
     */
    public static boolean isZipCodeValid(String text) {
        String regex = "^\\d{5}(?:[-\\s]\\d{4})?$";
        return text.matches(regex);
    }

    /**
     *
     * @param text
     * @return valid format 123-456-7890 OR 123.456.7890 OR 123 456 7890
     */
    public static boolean isPhoneNumberValid(String text) {
        Pattern regex = Pattern.compile("^(\\d{3}[- .]?){2}\\d{4}$");
        return regex.matcher(text).matches();
    }

    public static boolean isValueInteger(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
