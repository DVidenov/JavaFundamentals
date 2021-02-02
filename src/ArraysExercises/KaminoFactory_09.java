package ArraysExercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class KaminoFactory_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthDNA = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        //Получаваме масиви докато не въедем клон дем

        int countRow = 0;
        int sumOnes = 0;
        int onesInRow = 1;
        int mostOnes = 1;
        int currentRow = 1;
        int [] currentLine = new int[lengthDNA];
        while (!input.equals("Clone them!")){
             currentLine = Arrays.stream(input.split("!"))
                    .mapToInt(Integer::parseInt).toArray();
            countRow++;
            for (int i = 1; i < currentLine.length ; i++) {
                if (currentLine[i] == 1 && currentLine[ i - 1 ] == 1){
                    sumOnes++;
                }
                if (onesInRow > mostOnes){
                    mostOnes = onesInRow;
                }
            }
            onesInRow++;
            input = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", countRow, sumOnes);
        System.out.println(Arrays.toString(currentLine));
        //избираме най-дългата последователност от единици

            // ако има няколко избираме тази с по първи индекс на единица
            // ако има повезе от една с еднакъв стартов индекс на 1 притираме теси с най-голям сбор единици

        // принтираме "Best DNA sample (реда на масива) with sum: (сбора на единиците)
    }
}
