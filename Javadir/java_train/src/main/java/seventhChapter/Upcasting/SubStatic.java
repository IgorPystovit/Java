package seventhChapter.Upcasting;

public class SubStatic extends SuperStatic{
    public String name = "Sub";
    public static String statName = "Sub";

    public SubStatic(){
        System.out.println("SubStatic()");
    }

    public static String staticGet(){
        staticGet();
        return "Производная версия staticGet()";
    }

    public static void main(String[] args) {

    }
    public String dynamicGet(){
        return "Производная версия dynamicGet()";
    }
}
