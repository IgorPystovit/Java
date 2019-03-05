package tenthChapter.Singletone;

public class Singletone {
    private static Singletone inst = null;
    private Singletone(){}

    private static int i = 0;
    private static int a = 0;
    public static Singletone getInstance(){
        if (inst == null){
            inst = new Singletone();
            System.out.println(++i+"Set up");
        }

        return inst;
    }

    public void assureSet(){
        System.out.println("Var num "+i);
    }

}
