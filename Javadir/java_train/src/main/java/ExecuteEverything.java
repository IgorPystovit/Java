import java.util.*;

import seventhChapter.Upcasting.Exe;
import source.useful.simpleAr;

public class ExecuteEverything {
    private static Scanner scan=new Scanner(System.in);
    private static ExecuteEverything exe = new ExecuteEverything();
    public static void main(String[] args) {
        try{

            System.out.println("\u03bcs");
            }finally {
            new ExecuteEverything().finalize(scan);
        }

    }



    public static boolean isAlpha(char input){
        boolean isAlpha = false;
        if ( ((input >= 'a') && (input <= 'z')) || ((input >= 'A') && (input <= 'Z'))){
            isAlpha = true;
        }

        return isAlpha;

    }


    public String reverse(String needToReverse){
        char[] shortLive = needToReverse.toCharArray();
        char[] charReverse = new char[shortLive.length];
        int counter = 0;
        int lengthOfString = shortLive.length;
        for (int i = lengthOfString - 1; i >= 0; i--){
             charReverse[counter] = shortLive[i];
             counter++;
        }
        return needToReverse = String.valueOf(charReverse);
    }
    private void finalize(Scanner scan){
        System.gc();
        scan.close();
    }
}


