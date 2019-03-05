package Fiveth_Chapter.StaticKeyWord;

public class Static_Initialization {
    public static void printStatic(){
        System.out.println("Static string - "+str);
        System.out.println("Static reference - "+cup1);
    }
    static String str="str";
    static Cup cup1;
    static {
        cup1=new Cup(1);
    }

    public static void main(String[] args) {
        printStatic();
    }
}
