package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names= new ArrayList<>();
        names.add("Ivan");
        names.add("denis");
        names.add("gosho");
        names.add("kris");
        System.out.println(names.size());

        names.add(0, "Toshko");
        names.remove("gosho");
        names.remove(1);
        System.out.println("Do we have Toshko?" + names.contains("Toshko"));

        names.set(1, "Maria");
        System.out.println(names.toString().replaceAll("[\\[\\]]", ""));
        List<String> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(String::toString).collect(Collectors.toList());
    }
}
