package seventhChapter.Upcasting;

public class Exe {
    public static void main(String[] args) {
        SuperStatic obj2 = new SuperStatic();
        SuperStatic sup = new SubStatic();
        SuperStatic obj1 = new MoreSub();
        System.out.println(obj1.dynamicGet());
        System.out.println(obj2.dynamicGet());
        System.out.println(sup.dynamicGet());
    }
}
