package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        double average = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        average = sum * 1.0 / numbers.size();

        List<Integer> aboveAverage = new ArrayList<>();
        for (int number : numbers) {
            if (number > average){
                aboveAverage.add(number);
            }
        }
        if (aboveAverage.isEmpty()){
            System.out.println("No");
        } else {
            Collections.sort(aboveAverage);
            Collections.reverse(aboveAverage);

            for (int i = 0; i < Math.min(5, aboveAverage.size()); i++) {
                System.out.print(aboveAverage.get(i) + " ");
            }
        }
    }
}
