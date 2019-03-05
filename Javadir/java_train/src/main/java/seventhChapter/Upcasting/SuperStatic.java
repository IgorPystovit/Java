package seventhChapter.Upcasting;

public class SuperStatic {
    public String name = "Super";

    public static String statName = "Super";

    public SuperStatic(){
        System.out.println("SuperStatic()");
    }
    public static String staticGet(){
        return "Базовая версия staticGet()";
    }



    public String dynamicGet(){
        return "Базовая версия dynamicGet()";
    }
}
