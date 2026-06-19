package Interviewpreparation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

    public static void main(String[] args) {

        String email = "john@example.com";

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);// compile - it will compile the regular expression and return the pattern object.
        Matcher mat = pat.matcher(email);// matcher - it will match the given input with the pattern and return the matcher object.

        if (mat.matches())// matches - it will return true if the input matches the pattern, otherwise false.
            System.out.println("Valid email");
        else
            System.out.println("Invalid email");

    }
}

