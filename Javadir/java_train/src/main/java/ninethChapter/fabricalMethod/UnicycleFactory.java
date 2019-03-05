package ninethChapter.fabricalMethod;

public class UnicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Unicycle();
    }
}
