package com.beyond.person.core.helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class AssistingMethods {
    public static boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public static boolean isEmailValid(String email) {
        return email.matches("^(.+)@(.+)$");
    }

    public static boolean isNameAndLastNameValid(String name, String lastName) {
            return (name.length() > 0 && name.length() < 255 && 0 < lastName.length() && lastName.length() < 255
                    && (AssistingMethods.isAlpha(name)) && (AssistingMethods.isAlpha(lastName)));
        }
    }

