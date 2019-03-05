package ninethChapter.fabricalMethod;

public class Unicycle implements Cycle{
    public String getName(){
        return getClass().getSimpleName();
    }

    public void cycling(){
        System.out.println("Cycling "+getName());
    }
}
