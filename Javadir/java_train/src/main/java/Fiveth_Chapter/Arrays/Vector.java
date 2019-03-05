package Fiveth_Chapter.Arrays;
import java.util.Scanner;
public class Vector {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double doubleValue=scan.nextDouble();
        while(doubleValue>1){
            doubleValue-=1;
        }
        System.out.println((float)doubleValue);
    }

}
