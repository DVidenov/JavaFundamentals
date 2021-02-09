package Methods;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String number = scanner.nextLine();

        switch (type){
            case "int":
                int num = Integer.parseInt(number);
                dataConvertor(num);
                break;
            case "real":
                num = Integer.parseInt(number);
                dataConvertor1(num);
                break;
            case "string":
                dataConvertor2(number);
                break;
        }
    }

    private static void dataConvertor(int num) {
        int result = num * 2;
        System.out.println(result);
    }
    private static void dataConvertor1(double num) {
        double result = num * 1.5;
        System.out.printf("%.2d", result);
    }
    private static void dataConvertor2(String number) {
        String result = number;
        System.out.println("$" + result + "$");
    }
}
