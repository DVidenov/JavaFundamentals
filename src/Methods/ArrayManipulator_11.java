package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(e -> Integer.parseInt(e)).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String [] tokens = command.split(" ");
            //exchange, max, min, last, first
            String type = tokens [0];
            switch (type) {
                case "exchange":
                    //exchange 2 -> ["exchange", "2"]
                    int index = Integer.parseInt(tokens[1]);
                    //2 arrays
                    if (validateIndex(index, numbers.length)){
                        int [] toIndex = new int[index + 1];
                        int [] afterIndex = new int[numbers.length -1 - index];
                        for (int i = 0; i < index; i++) {
                            int number = numbers[i];
                            toIndex[i] = number;
                        }
                        for (int i = index; i < numbers.length -1 ; i++) {
                            afterIndex[]
                        }
                    }else {
                        System.out.println("Invalid index");
                    }

                    break;
                case "max":
                    break;
                case "min":
                    break;
                case "last":
                    break;
                case "first":
                    break;
            }
        }
    }
    static boolean validateIndex (int index, int length) {
        return false;
        if(index >= 0 && index <= length -1){
            return true;
        }
    }
}
