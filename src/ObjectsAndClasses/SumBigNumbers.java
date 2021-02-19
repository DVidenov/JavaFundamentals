package ObjectsAndClasses;

public class SumBigNumbers {
    private long firstDig;
    private long secondDig;

    //Constructor
    public SumBigNumbers() {
        this.firstDig = 0;
        this.secondDig = 0;
    }

    //Setters
    public void setFirstDig(long firstDig) {
        this.firstDig = firstDig;
    }

    public void setSecondDig(long secondDig) {
        this.secondDig = secondDig;
    }

    //Getters
    public long getResult(){
        return firstDig + secondDig;
    }
}
