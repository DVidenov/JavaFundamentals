package Methods;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (!validLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!validateContent(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!validateDigitCount(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if (validateDigitCount(password) && validateContent(password) && validLength(password)){
            System.out.println("Password is valid");
        }
    }
    static boolean validLength(String password){
        return password.length() >= 6 && password.length() <= 10;
    }
    static boolean validateContent (String password){

        for (int index = 0; index < password.length() - 1; index++) {
            char currentSymbol = password.charAt(index);
            boolean isSmallLetter = currentSymbol >=97 && currentSymbol <=122;
            boolean isCapitalLetter = currentSymbol >=65 && currentSymbol <=90;
            boolean isDigit = currentSymbol >= 48 && currentSymbol <= 57;
            if (!isCapitalLetter && !isSmallLetter && !isDigit) {
                return false;
            }
        }
        return true;
    }
    static boolean validateDigitCount (String password){
        int countDigits = 0;

        for (int index = 0; index < password.length() - 1; index++) {
            char currentSymbol = password.charAt(index);
            if (Character.isDigit(currentSymbol)) {
                countDigits ++;
            }
        }
        if (countDigits >= 2) {
            return true;
        }else {
            return false;
        }
    }
}
