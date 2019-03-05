package seventhChapter.vehicles;

public class Vehicle {
    public static String name;

    public static String staticGet(){
        return "super staticGet";
    }

    public void callStatic(){
        System.out.println(staticGet());
    }

    public String dynamicGet(){
        return "super dynamicGet";
    }
    private int Field = 0;

    public int getField(){
        return Field;
    }

    public Vehicle(){
        System.out.println("Constructor vehicle");
    }

    protected static int k=staticInit("field k class Vehicle has initialized",47);
    protected static int staticInit(String s,int d){
        System.out.println(s);
        return d;
    }
}
