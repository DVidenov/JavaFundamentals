package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConvertListToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(" "))
                .map(String::toString).collect(Collectors.toList());

        String[] arrayItems = new String[items.size()];
        items.toArray(arrayItems);

        for (String arItem : arrayItems) {
            System.out.print(arItem + " ");
        }
    }
}
