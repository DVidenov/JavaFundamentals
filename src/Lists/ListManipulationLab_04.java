package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationLab_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> streamList = Arrays.stream(input.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        while (!input.equals("end")) {
            input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            listManipulator(streamList, input);
        }
    }

    public static void listManipulator(List<Integer> streamList, String input) {
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        int tempDig = 0;
        int tempDig2 = 0;
        int count = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                count++;
                if (count == 1){
                    sb.append(c);
                    tempDig = Integer.parseInt(sb.toString());
                }
                else if (count == 2) {
                    sb.setLength(0);
                    sb.append(c);
                    tempDig2 = Integer.parseInt(sb.toString());
                }
            }
        }
        if (input.contains("Add")) {
            streamList.add(tempDig);
        } else if (input.contains("Remove")) {
            streamList.remove(Integer.valueOf(tempDig));
        } else if (input.contains("RemoveAt")) {
            streamList.remove(tempDig);
        } else if (input.contains("Insert")) {
            streamList.add(tempDig, tempDig2);
        }
        System.out.println(streamList.toString().replaceAll("[\\[\\],]", ""));
    }
}
