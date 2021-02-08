package Methods;

import java.util.Scanner;

public class addAndSubstract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int temp  = AddMethord(num1, num2);
        System.out.println(Subtract(num3,temp));
    }

    private static int AddMethord(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    private static int Subtract (int num3, int temp){
        int result = temp- num3;
        return result;
    }
}
