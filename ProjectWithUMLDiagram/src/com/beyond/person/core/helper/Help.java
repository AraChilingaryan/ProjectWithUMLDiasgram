package com.beyond.person.core.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Help {
    public static boolean checkAlphabet(String name) {
        char[] ch = name.toCharArray();
        for (char c : ch) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmailCorrect(String email){
        String regex = "^(.+)@(.+)$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
