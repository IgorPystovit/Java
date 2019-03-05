package seventhChapter.Rodents;

import seventhChapter.refCounter.Link;

//:seventhChapter/Rodents/Mouse.java
public class Mouse implements Rodent{
    private static final String name = "Mouse";
//    private Description d = new Description("Gray-colored",new Link("Description","Mouse"),"Mouse");
    private Characteristic c = new Characteristic("Live in the hole");

    public void printDescription(){
//        System.out.println(d.getDesVar());
        System.out.println(c.getCharVar());
//        d.setDesVar("Another description(Mouse)");
        c.setCharVar("Another characteristic(Mouse)");
//        System.out.println(d.getDesVar());
        System.out.println(c.getCharVar());
    }
    public Mouse(){
        System.out.println("Mouse()");
    }

    public void erase(){
        System.out.println("erase() Mouse");
//        d.erase();
        c.erase();
    }

    public String what(){
        return "Mouse";
    }


    public void toGnaw(){
        System.out.println("Mouse.toGnaw()");
    }
}
