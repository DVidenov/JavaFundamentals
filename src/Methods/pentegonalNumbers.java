package Methods;

import java.util.Scanner;

public class pentegonalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int numUntil = Integer.parseInt(scanner.nextLine());
        for (int index = 1; index <= numUntil; index++) {
            System.out.printf("%-6d",getPentagonalNumbers(index));
            if (count % 10 == 0){
                System.out.println();
                count++;
            }
        }
    }

    public static int getPentagonalNumbers(int index){
        return (index * (3 * index - 1)) / 2;
    }
}
