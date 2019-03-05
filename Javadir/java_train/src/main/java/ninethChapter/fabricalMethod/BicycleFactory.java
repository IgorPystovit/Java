package ninethChapter.fabricalMethod;

public class BicycleFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Bicycle();
    }
}
