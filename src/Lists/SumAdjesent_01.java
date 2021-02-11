package Lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjesent_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userInput = scanner.nextLine().split(" ");
        /*List <Double> numberList = new ArrayList<>();
        for (String stringInput: userInput) {
            numberList.add(Double.parseDouble(stringInput));
        }*/
        List<Double> streamList = Arrays.stream(userInput).map(Double::parseDouble).collect(Collectors.toList());
        System.out.println();

        for (int i = 0; i < streamList.size() - 1; i++) {
            if(streamList.get(i).equals(streamList.get(i + 1))){
                double sum = streamList.get(i) + streamList.get(i + 1);
                streamList.set(i, sum);
                streamList.remove(i + 1);
                i = - 1;
            }
        }
        //System.out.println(streamList.toString().replaceAll("[\\[\\],]", ""));
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double number:streamList) {
            System.out.print(decimalFormat.format(number) + " ");
        }
    }
}
