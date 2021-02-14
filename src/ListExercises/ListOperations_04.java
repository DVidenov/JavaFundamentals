package ListExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] token = command.split("\\s+");
            if (token[0].equals("Add")){
                numbers.add(Integer.parseInt(token[1]));
            } else if (token[0].equals("Insert")){
                if (Integer.parseInt(token[2]) > numbers.size()){
                    System.out.println("Invalid index");
                } else {
                    numbers.add(Integer.parseInt(token[2]), Integer.parseInt(token[1]));
                }
            } else if (token[0].equals("Remove")){
                if (Integer.parseInt(token[1]) > numbers.size()){
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(Integer.parseInt(token[1]));
                }
            } else if (token[1].equals("left")){
                for (int i = 0; i < Integer.parseInt(token[2]); i++) {
                    int firstTempDig = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstTempDig);
                }
            } else if (token[1].equals("right")){
                for (int i = 0; i < Integer.parseInt(token[2]); i++) {
                    int lastTempDig = numbers.get(numbers.size() - 1);
                    numbers.remove(lastTempDig);
                    numbers.add(0, lastTempDig);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
