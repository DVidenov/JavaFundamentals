package Methods;

import java.util.Scanner;

public class PrintCharBetweenVal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        printVal(start, end);
    }
    public static void printVal(int start, int end){
        for (int symbol = start; symbol < end; symbol++) {
            char current = (char)symbol;
            System.out.println(current);
        }
    }
}
