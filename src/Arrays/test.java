package Arrays;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        String[] items = values.split(" ");

        int[] arr = new int[items.length];
        for (int i = 0; i < items.length; i++){
            arr[i] = Integer.parseInt(items[i]);
            System.out.print(String.valueOf(items[i]).concat(" "));
        }
    }
}
