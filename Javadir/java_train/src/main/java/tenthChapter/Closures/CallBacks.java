package tenthChapter.Closures;

public class CallBacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Call cbr1 = new Call(c1);
        Call cbr2 = new Call(c2);
        cbr1.go();
        cbr1.go();
        cbr2.go();
        cbr2.go();
    }
}
