package Methods;

import java.util.Scanner;

public class testing10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        Matrix(num);
    }
    private static void Matrix (int number){
        int count = number;
        while (count !=0){
            for (int index = 0; index < number ; index++) {
                System.out.print(number);
            }
            System.out.println();
            count--;
        }
    }
}
