package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Map<Character, Integer> lettersCount = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if(currentSymbol == ' '){
                continue;//връшаме се на следващият индекс от цикъла
            }
            if (!lettersCount.containsKey(currentSymbol)) {
                //не сме срещали символа
                lettersCount.put(currentSymbol, 1);
            } else {
                //срещали сме символа
                lettersCount.put(currentSymbol, lettersCount.get(currentSymbol) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
