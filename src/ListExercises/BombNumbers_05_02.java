package ListExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BombNumbers_05_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> data = strToList(scan.nextLine());
        String[] bomb = scan.nextLine().split(" ");
        int bombNum = Integer.parseInt(bomb[0]);
        int bombPow = Integer.parseInt(bomb[1]);
        boolean check = data.contains(bombNum);

        while (check) {
            int index = data.indexOf(bombNum);
            int start = Math.max(0, index - bombPow);
            int finish = Math.min(index + bombPow + 1, data.size());

            for (int i = start; i < finish; i++) {
                data.set(i, 0);
            }

            if (!data.contains(bombNum)) {
                check = false;
            }
        }

        sumIntegerList(data);
    }

    static ArrayList<Integer> strToList(String input) {
        ArrayList<Integer> result = new ArrayList<>();
        String[] data = input.split(" +");
        for (int i = 0; i < data.length; i++) {
            result.add(Integer.parseInt(data[i]));
        }
        return result;
    }

    static void sumIntegerList(List<Integer> data) {
        int sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i);
        }
        System.out.println(sum);
    }

}