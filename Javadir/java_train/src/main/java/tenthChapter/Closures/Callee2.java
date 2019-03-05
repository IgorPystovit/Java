package tenthChapter.Closures;

public class Callee2 extends MyIncrement implements Incrementable{
    private int i = 0;

    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }

//    private class Closure implements Incrementable{
//        public void increment(){
//            Callee2.this.increment();
//        }
//    }

//    public Incrementable getClosure(){
//        return new Closure();
//    }
}
