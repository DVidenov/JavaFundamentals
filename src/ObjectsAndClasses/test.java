package ObjectsAndClasses;

import java.time.LocalDate;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Dice myDice = new Dice();
        myDice.setSides(6);
        System.out.println(myDice.getSides());
        myDice.roll();
    }
}
