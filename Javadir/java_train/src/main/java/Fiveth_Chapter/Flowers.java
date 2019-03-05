package Fiveth_Chapter;

public class Flowers {
    int petalCounter=0;
    String s="initial value";
    Flowers(int petals){
        petalCounter=petals;
        System.out.println("Constructor with int-typed argument "+petalCounter);
    }
    Flowers(String ss){
        s=ss;
        System.out.println("Constructor with string-typed argument "+ss);
    }
    Flowers(int petals,String s){
//        this(petals);
//        this(this.s);
        System.out.println("Constructor with int-typed and string-typed arguments");
    }
    Flowers(byte petals,String s){
        System.out.println("byte-string-typed constructor");
    }

    public void overload(int k,double l){
        System.out.println("Invoke first");
    }
    public void overload(byte k,double l){
        System.out.println("Invoke second");
    }
    public static void main(String[] args) {
//        Flowers x=new Flowers(3,"test");
        byte k=3;

        Flowers a=new Flowers((byte)3,"Invoke");
//        a.overload();

    }
}
