package MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SecretChat_TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> input = new ArrayList<>();
        String instructions = scanner.nextLine();
        for (char character:Character.toChars(Integer.parseInt(instructions))) {
            input.add(character);
        }
        String tempSubStr = "";
        List<String> stringInput = new ArrayList<>();
        while (!instructions.equals("Reveal")){
            if (instructions.split(":\\|:")[0].equals("InsertSpace")){
                int index = Integer.parseInt(Arrays.toString(instructions.split(":\\|:")));
                input.add(index, (char) 32);
            } else if (instructions.split(":\\|:")[0].equals("Reverse")){
                String substring = instructions.split(":\\|:")[1];
                List<String> filteredList = stringInput.stream().filter(s -> s.contains(substring)).collect(Collectors.toList());
                for (char character : input) {
                    stringInput.add(String.valueOf(character));
                }
                for (String string : stringInput)
                if (string.contains(substring)){
                    tempSubStr = string;
                    byte [] subString = tempSubStr.getBytes();
                    byte[] result = new byte[subString.length];
                    for (int i = 0; i < subString.length; i++) {
                        result[i] = subString[subString.length - i - 1];
                    }
                    stringInput.remove(string);
                    stringInput.add(stringInput.size(), result.toString());
                }
            }
        }
    }
}
