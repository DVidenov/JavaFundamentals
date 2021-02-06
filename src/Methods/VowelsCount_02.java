package Methods;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        VowelsCount(input.toLowerCase());
    }

    static void VowelsCount (String input){
        int count = 0;
        for (char character = 0; character < input.length(); character++) {
            char current = input.charAt(character);
            if (current == 97 || current == 101 || current == 105 || current == 111 || current == 117 || current == 121){
                count ++;
            }
        }
        System.out.println(count);
    }
}
