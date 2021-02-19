package ObjectsAndClasses;

import java.util.Random;

public class Dice {
    private int sides;

    public void setSides(int number){
        if (number<0){
            sides = 1;
        }
        sides = number;
    }

    public int getSides(){
        return sides;
    }

    int roll (){
        Random random = new Random();
        int number = random.nextInt(sides + 1);
        return number;
    }

}
