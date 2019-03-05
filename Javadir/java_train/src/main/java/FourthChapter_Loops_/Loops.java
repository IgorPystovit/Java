package FourthChapter_Loops_;
import java.util.Random;
//import static FourthChapter_Loops_.source.useful.*;

public class Loops {
    public static boolean test(int testval,int begin,int end){
        if(testval>=begin && testval<=end){
            return true;
        }else
            return false;

    }
    public static void main(String[] args) {
       if(test(10,10,15)){
           System.out.println("true");
       }else
           System.out.println("false");
//        int eventCounter=0;
//        for(int i=1;i<=25;i++){
//            eventCounter=0;
//            for(int j=1;j<=25;j++){
//                if(i%j==0){
//                   eventCounter++;
//                }
//
//            }
//        if(eventCounter<=2){
//            System.out.println("Requested number="+i);
//        }
//        }
    }
}
