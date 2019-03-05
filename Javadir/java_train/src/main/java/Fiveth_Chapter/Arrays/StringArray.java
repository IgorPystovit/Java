package Fiveth_Chapter.Arrays;

public class StringArray {

    StringArray(String str){
        System.out.println(str);

    }
//    StringArray stringCompleted=new StringArray("fire");

    public static void main(String[] args) {
        StringArray obj=new StringArray("Blabla");
        StringArray[] toStringArray=new StringArray[]{new StringArray("worse"),new StringArray("better"),obj};

        for(StringArray clone:toStringArray ){
            System.out.println(clone);
        }
//        obj.toStringArray[1]=new StringArray("kael");
//        String[] StrArray=new String[]{new String("Dynamic"),new String("Core"),new String("bot")};
//        for(String s: StrArray){
//            System.out.println(s);
//        }
    }
}
