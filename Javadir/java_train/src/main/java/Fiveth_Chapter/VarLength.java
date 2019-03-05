package Fiveth_Chapter;

public class VarLength {
    public static void f(String... args){
        System.out.println("f method");
        for(String str:args){
            System.out.println(str);
        }
    }
//    public static void mainTest(String...args ){
//
//    }
    public static void mainn(String...args){
        for(String clone:args){
            System.out.println(clone);
        }
    }
    public static void main(String[] args) {
//        mainn(args,new String());
//        String[] arrayOfStr=new String[]{
//                "first",
//                "second",
//                "third"
//        };
//        f(arrayOfStr);
//        f("FIRST","SECOND",new String("THIRD"));
    }
}
