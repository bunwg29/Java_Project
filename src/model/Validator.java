
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator{
    public static boolean isValidIdentify(String CCCD){
        String regex = "^[0-9]{12}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(CCCD);
        
        return matcher.matches();
    }
    public static boolean isValidPhoneNumber(String phoneNumber){
        String regex = "^(\\+84|0)(3[2-9]|5[2689]|7[0|6-9]|8[1-9]|9[0-9])[0-9]{7}$";
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(phoneNumber);
        
        return matcher.matches();
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
