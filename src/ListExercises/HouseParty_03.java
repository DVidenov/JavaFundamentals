package ListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandsNumber = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < commandsNumber; i++) {
            String command = scanner.nextLine();
            String[] token = command.split("\\s+");
            if (token[2].equals("going!")){
                if (!names.contains(token[0])){
                    names.add(token[0]);
                }else {
                    System.out.printf("%s is already in the list!\n", token[0]);
                }
            }else if (token[2].equals("not")){
                if (names.contains(token[0])){
                    names.remove(token[0]);
                } else{
                    System.out.printf("%s is not in the list!\n", token[0]);
                }
            }
        }
        for (String name:names) {
            System.out.println(name);
        }
    }
}
