package ListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoreExercises_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers = scanner.nextLine().split(" ");
        String text = scanner.nextLine();

        List<Integer> indexes = new ArrayList<>(numbers.length);
        // Calculating the digits in numbers [] and passing them to new List
        for (String currentString : numbers) {
            int tempDig = 0;
            char [] chars = currentString.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                tempDig += Character.getNumericValue(chars[i]);
            }
            indexes.add(tempDig);
        }

        //passing text string to char array
        //char[] charSymbols = new char[text.length()];
        StringBuilder charSymbols = new StringBuilder(text.length());
        for (int i = 0; i < text.length(); i++) {
            charSymbols.append(text.charAt(i));
        }
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < indexes.size(); i++) {
            int tempNumber = indexes.get(i);
            for (int j = 0; j < charSymbols.length(); j++) {
                if (tempNumber == j){
                    char tempLetter = Character.valueOf(charSymbols.charAt(j));
                    sb.append(tempLetter);
                    charSymbols.deleteCharAt(j);
                }
            }
        }
        System.out.println(sb);
    }
}