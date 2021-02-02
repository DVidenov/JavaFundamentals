package ArraysExercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LadyBug_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfField = Integer.parseInt(scanner.nextLine());
        int [] field = new int [sizeOfField];

        int [] initialIndexes = new int [sizeOfField];
        initialIndexes = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();

        for (int place = 0; place <= field.length - 1; place++) {
            if (field[place] == initialIndexes[place]){
                initialIndexes[place] = 1;
            }else {
                initialIndexes[place] = 0;
            }
        }
        System.out.println(Arrays.toString(initialIndexes));
    }
}
