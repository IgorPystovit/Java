package Sixth_Chapter.Access;
//Sixth_Chapter.Access.Execute.java
import Sixth_Chapter.Access.*;
public class Execute extends Cookie  {
    int a;
    String s;
    float fl,kl;
    {
        a=3;
        s="start";
        fl=5;
        kl=3;
    }
    public static void main(String[] args) {

        Cookie oj=new Cookie();
        Widget wid=new Widget();
        wid.makeWidget();
        Execute fields=new Execute();
        System.out.println(fields.a+" "+fields.s+" "+fields.fl);
    }
}
