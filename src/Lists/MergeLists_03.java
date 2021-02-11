package Lists;

import org.ietf.jgss.GSSContext;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergeLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int size = Math.min(firsList.size(), secondList.size());
        for (int i = 0; i < size; i++) {
            System.out.print(firsList.get(i) + " " + secondList.get(i) + " ");
        }
        printTheRest(firsList, size);
        printTheRest(secondList, size);
    }
    private static void printTheRest (List<Integer> numbers, int beginIndex){
        for (int i = beginIndex; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
