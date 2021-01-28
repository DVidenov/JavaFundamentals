package Arrays;

import java.util.Scanner;

public class ReadArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = new String[n];

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }
        System.out.println(names);
    }
}
