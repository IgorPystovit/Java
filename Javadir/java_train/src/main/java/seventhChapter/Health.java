package seventhChapter;
import java.util.Scanner;
public class Health {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String A=scan.nextLine();
        String B=scan.nextLine();
        String H=scan.nextLine();
        int a=Integer.parseInt(A);
        int b=Integer.parseInt(B);
        int h=Integer.parseInt(H);
        if(h>=a && h<b){
            System.out.println("Normal");
        }else if(h>=b){
            System.out.println("Excess");
        }else{
            System.out.println("Deficiency");
        }
    }

}

