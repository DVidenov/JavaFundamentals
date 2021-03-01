package MidExamPreparation;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();

        String result = "";
        while (!command.equals("Reveal")){
            if(command.split(":\\|:")[0].equals("InsertSpace")){
                int index = Integer.parseInt(command.split(":\\|:")[1]);
                input = input.substring(0, index) + " " + input.substring(index);
                System.out.println(input);
                command = scanner.nextLine();
            } else if (command.split(":\\|:")[0].equals("Reverse")){
                String substring = command.split(":\\|:")[1];
                if (input.contains(substring)){
                    input = input.replaceFirst(substring, "");

                    StringBuilder reversedSubstring = new StringBuilder();
                    reversedSubstring.append(substring);
                    reversedSubstring.reverse();
                    input = input.concat(String.valueOf(reversedSubstring));
                } else {
                    System.out.println("error");
                }
                System.out.println(input);
                command = scanner.nextLine();
            } else if (command.split(":\\|:")[0].equals("ChangeAll")){
                String charsToBeChanged = command.split(":\\|:")[1];
                String charsReplacement = command.split(":\\|:")[2];
                input = input.replaceAll(charsToBeChanged, charsReplacement);
                System.out.println(input);
                command = scanner.nextLine();
            }
        }
        System.out.println("You have a new text message: " + input);
    }
}
