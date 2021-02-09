package Methods;

import java.util.Scanner;

public class CountVowelsInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countVowels(input));
    }
    public static int countVowels(String input){
        int count = 0;
        for (int index = 0; index < input.length(); index++)
        {
            if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i' ||
                    input.charAt(index) == 'o' || input.charAt(index) == 'u' )
            {
                count++;
            }
        }
        return count;
    }
}
