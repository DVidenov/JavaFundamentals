package ObjectsAndClasses.OrderByAge_07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<OrderByAge> orderByAges = new ArrayList<>();
        while (!input.equals("End")) {
            String name = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);
            OrderByAge orderByAge = new OrderByAge(name, id, age);
            orderByAges.add(orderByAge);
            input = scanner.nextLine();
        }
        orderByAges.sort(Comparator.comparing(OrderByAge::getAge));
        for (OrderByAge orderByAge : orderByAges) {
            System.out.printf("%s with ID: %s is %d years old.\n", orderByAge.getName(), orderByAge.getId(), orderByAge.getAge());
        }
    }
}
