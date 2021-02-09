package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Прочитане на масив от стрингове
        String [] input = scanner.nextLine().split(" ");

        //Преобръщане на масива
        for (int i = 0; i < input.length / 2 ; i++) {
            String temp = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = temp;
        }
        //принтиране на обърнатият масив
        System.out.println(String.join(" ", input));
    }
}
