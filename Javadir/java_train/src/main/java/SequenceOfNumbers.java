import java.util.*;
public class SequenceOfNumbers {
    public static void main(String[] args) {
        int counter=0;
        int sequenceNum;
        do{
            sequenceNum=new Scanner(System.in).nextInt();
            if(sequenceNum>0){
                counter++;
            }
        }while(sequenceNum!=0);
        System.out.println(counter);
    }

}
