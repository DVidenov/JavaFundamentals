package ListExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        for (int i = 0; i <= countCommands; i++) {
            String command = scanner.nextLine();
            String [] tokens = command.split("\\s+");
            String name = tokens [0];
            if (tokens[2].equals("going!")){ // going
                if (guests.contains(name)){
                    System.out.printf("%s is already in the list!\n", name);
                } else {
                    guests.add(name);
                }
            } else if (tokens[2].equals("not")){ // not going
                if (guests.contains(name)){
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!\n", name);
                }
            }
        }
        printNames(guests);
    }

    private static void printNames(List<String> guests) {
        for (String name : guests) {
            System.out.println(name);
        }
    }
}
