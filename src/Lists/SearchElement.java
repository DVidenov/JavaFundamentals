package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(" "))
                .map(String::toString).collect(Collectors.toList());

        String searchedItem = scanner.nextLine();
        while (!searchedItem.equals("end")){
            if (items.contains(searchedItem)){
                System.out.printf("Item %s has been found.", searchedItem);
                System.out.println();
                searchedItem = scanner.nextLine();
            }
        }
    }
}
