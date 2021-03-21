package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        Map<String, String> registered = new HashMap<>();
        String licenseNumber = "";

        for (int i = 0; i < numberOfLines; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("register")){
                if (registered.containsKey(input[1])){
                    for (Map.Entry<String, String> entry : registered.entrySet()) {
                        if (entry.getValue().equals(input[1])) {
                            licenseNumber = entry.getKey();
                            System.out.printf("ERROR: already registered with plate number %s\n", licenseNumber);
                        }
                    }
                }else {
                    System.out.printf("%s registered %s successfully\n", input[1], input[2]);
                }
                registered.put(input[1], input[2]);
            } else if (input[0].equals("unregister")){
                if (registered.containsKey(input[1])){
                    registered.remove(input[1]);
                    System.out.printf("%s unregistered successfully\n", input[1]);
                } else {
                    System.out.printf("ERROR: user %s not found\n", input[1]);
                }
            }
        }
        for (Map.Entry<String, String> entry : registered.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
