package Methods;

import java.util.Scanner;

public class Palindrome_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            int comparison = input.compareTo(reversedString(input));
            if(comparison == 0){
                System.out.println("true");

            }else{
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }
    static String reversedString(String input) {
        return new StringBuffer(input).reverse().toString();
    }

}