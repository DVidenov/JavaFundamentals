package ObjectsAndClasses;

import java.time.LocalDate;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {


        String str = "Ivan Blagoi Georgi";

        for (int i = 0; i < 3; i++) {
            String output = str.split(" ")[1];
            System.out.println(output);
        }
    }
}
