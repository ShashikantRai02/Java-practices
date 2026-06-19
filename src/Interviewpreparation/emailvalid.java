package Interviewpreparation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailvalid {
    public static void main(String[] args) {
        String email="shashi@gmail1.com";
        // Regular expression for validating an Email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";


                Pattern pattern = Pattern.compile(emailRegex);// compile - it will compile the regular expression and return the pattern object.
                Matcher matcher = pattern.matcher(email);// matcher - it will match the given input with the pattern and return the matcher object.

                if (matcher.matches())// matches - it will return true if the input matches the pattern, otherwise false.
                    System.out.println("Valid email");
                else
                    System.out.println("Invalid email");

            }}




