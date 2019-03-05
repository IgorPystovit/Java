package ninethChapter.interfaceAdapters;
import java.nio.CharBuffer;
import java.util.*;
public class RandomDouble {
    private static Random rnm = new Random();

    public int counter = 0;
    public RandomDouble(int count){
        this.counter = count;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public double next(){
        return rnm.nextDouble();
    }


    }



