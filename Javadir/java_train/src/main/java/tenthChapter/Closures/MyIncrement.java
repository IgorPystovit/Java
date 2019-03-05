package tenthChapter.Closures;

public class MyIncrement {
    public void increment(){
        System.out.println("Another operation");
    }

    public static void f(MyIncrement obj){
        obj.increment();
    }
}
