package FourthChapter_Loops_;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        int prev=0;
        int cur=0;
        int next=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Required amount of Fibonacci numbers");
        int amount=scan.nextInt();
        for(int i=1;i<=amount;i++){
            if(i==1){
//                cur=0;
//                prev=0;
                System.out.print(1+" ");
                continue;
            }
//            if(i==2){
//                System.out.println(1+" ");
//                continue;
//            }
            prev=cur;
            cur=next;
            next=prev+cur;
            System.out.print(next+" ");
        }
    }
}
