package thirdChapter;
import java.util.*;
public class Coin {
    public static void main(String[] args) {
        Random randomNumber=new Random();
        int flipResult=randomNumber.nextInt(2);
        System.out.println("res="+flipResult);
        if(flipResult==1)
        {
            System.out.println("Eagle");
        }else{
            System.out.println("Tails");
        }

    }
}
