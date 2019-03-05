package ninethChapter.fabricalMethod;

public class CyclePark {
    public static void ride(CycleFactory factory){
        Cycle kind = factory.getCycle();
        kind.cycling();
    }

    public static void main(String[] args) {
        ride(new UnicycleFactory());
        ride(new BicycleFactory());
    }
}
