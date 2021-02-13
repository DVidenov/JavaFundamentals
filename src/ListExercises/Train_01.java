package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            if (tokens.length == 2) {
                int newWagon = Integer.parseInt(tokens[1]);
                wagons.add(newWagon);
            } else {
                int passengersToAdd = Integer.parseInt(tokens[0]);
                for (int i = 0; i <= wagons.size() - 1; i++) {
                    int passengersInWagon = wagons.get(i);
                    if (passengersInWagon + passengersToAdd <= maxCapacity) {
                        wagons.add(i, passengersInWagon + passengersToAdd);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        printList(wagons);
    }
    private static void printList(List<Integer> wagons){
        for (int wagon:wagons) {
            System.out.print(wagon + " ");
        }
    }
}