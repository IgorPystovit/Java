package ninethChapter.interfaceExtension;
import java.util.Scanner;
public class IncrementNumbers extends NumberCalc implements Process{
    public static IncrementNumbers incrision = new IncrementNumbers();
    public String readLine(){
        return new Scanner(System.in).nextLine();
    }

    public int readNumber(){
        return new Scanner(System.in).nextInt();
    }

    public int increment(int a){
        return ++a;
    }

    public int increment(int a,int incrementNum){
        return (a + incrementNum);
    }

    public void process(){
        System.out.println(increment(readNumber()));
    }

    public void print(Object input){
        System.out.print(input);
    }

    public void println(Object input){
        System.out.println(input);
    }

    public int readable(Read obj){
        return obj.readNumber();
    }

    public int increadable(Incrementable obj, int arg){
        return obj.increment(arg);
    }

    public void printable(Printable obj, Object input){
        obj.print(input);
    }

    public void toProcess(Process obj){
        obj.process();
    }

    public static void main(String[] args) {
        int a = incrision.readable(incrision);
        incrision.printable(incrision,incrision.increadable(incrision,a));
        incrision.toProcess(incrision);
    }


}
