package ListExercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")) //split-ва по white spaces независимо колко са
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String command = input.split(" ")[0];// Delete or Insert
            int element1 = Integer.parseInt(input.split(" ")[1]);

            if (command.equals("Delete")){
                numbers.removeAll(Arrays.asList(element1));
            } else if (command.equals("Insert")){
                int element2 = Integer.parseInt(input.split(" ")[2]);
                numbers.add(element1, element2);
            }
            input = scanner.nextLine();
        }
        printList(numbers);
    }

    private static void printList(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
