package Interview_questions.Java;

import org.jsoup.select.Evaluator;

public class PasswordValidation {
    /*1. Write a return method that can verify if a password is valid or not.
		requirements:
		1. Password MUST be at least have 6 characters and should not contain space
		2. PassWord should at least contain one upper case letter
		3. PassWord should at least contain one lowercase letter
		4. Password should at least contain one special characters
		5. Password should at least contain a digit
		if all requirements above are met, the method returns true, otherwise returns  false
		*/
    public static void main(String[] args) {
        String password = "";
        System.out.println(PassWordValidation(password));
    }

    public static boolean PassWordValidation(String password){

        String lowercase = "(.*[a-z]*.)";
        String uppercase = "(.*[A-Z]*.)";
        String numbers = "(.*[0-9]*.)";
        String specialchars = "(.*[-/,:-@]*.)";

        boolean HashLower = password.matches(lowercase),
                HashUpper = password.matches(uppercase),
                HashDigit = password.matches(numbers),
                HashSpecial = password.matches(specialchars),
                Valid = false;
        if(password.length()>=6 && !password.contains(" "))
            if(HashLower&&HashUpper&&HashDigit&&HashSpecial)
                Valid=true;
        return true;
    }
}