package ninethChapter.interfaceAdapters;

import java.util.*;
import java.nio.CharBuffer;

public class RandomDoubleAdapter implements Readable {
    private static Random rnm = new Random();
//    private int counter = 0;
    private RandomDouble doubleNum;
    public RandomDoubleAdapter(RandomDouble doubleNum){
       this.doubleNum = doubleNum;
    }
    public int read(CharBuffer cb){
        if (doubleNum.counter-- == 0){
            return -1;
        }
        String temp = doubleNum.next()+" ";
        cb.append(temp);
        return temp.length();
    }

}
