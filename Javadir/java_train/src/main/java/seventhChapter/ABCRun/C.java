package seventhChapter.ABCRun;

public class C extends A {
    C(){
        super(90);
        System.out.println("C default constructor");
    }

    C(int arg){
        super(arg);
        System.out.println("C one-argumented constructor "+arg);
    }
    public static void main(String[] args) {
//        B Btype = new B();
        C Ctype = new C();
    }
}
