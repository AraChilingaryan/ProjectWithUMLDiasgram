package com.beyond.person.core.helper;

import com.beyond.person.core.model.BasePerson;
import com.beyond.person.core.model.Dancer;
import com.beyond.person.core.model.Programmer;
import com.beyond.person.core.model.Singer;

import java.util.Scanner;
import java.util.SimpleTimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class AssistingMethods {
    public static boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public static boolean isEmailValid(String email) {
        final String regex = "^(.+)@(.+)$";
        return email.matches(regex);
    }

    public static boolean isNameAndLastNameValid(String name, String lastName) {
            return (name.length() > 0 && name.length() < 255 && 0 < lastName.length() && lastName.length() < 255
                    && (AssistingMethods.isAlpha(name)) && (AssistingMethods.isAlpha(lastName)));
        }
}

