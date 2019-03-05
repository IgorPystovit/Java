package seventhChapter.Final_Test;

import java.util.Random;
public class Final {
    private String ID;
    Final(String common){
        this.ID=common;
    }
    int plus(int a){
        return a+1;
    }

    public final int CONST=new Random().nextInt(10);
    private static final int DECONST=new Random().nextInt(10);
    private static final Test merch=new Test(9);
    private final Test MERCH=new Test(3);
//    static {
//        merch=new Final();
//    }

    public String toString(){
        return "ID-"+ID+" CONST="+CONST+" DECONST="+DECONST;
    }
    public static void main(String[] args) {
         Final obj=new Final("Fobj1");
         obj.MERCH.argument++;
         Final obj2=new Final("Fobj2");
        System.out.println(obj);
        System.out.println(obj2);
    }

}
