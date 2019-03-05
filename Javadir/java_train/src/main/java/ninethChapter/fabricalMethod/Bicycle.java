package ninethChapter.fabricalMethod;

public class Bicycle implements Cycle {
    public String getName(){
        return getClass().getSimpleName();
    }
    public void cycling(){
        System.out.println("Cycling "+getName());
    }
}
