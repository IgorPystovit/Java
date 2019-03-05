package seventhChapter.Cycles;

public class Tricycle extends Cycle{
    public Tricycle(){
        System.out.println("Constructor Tricycle");
    }
    public void cycling(){
        System.out.println("Tricycle");
    }
    public void balnce(){
        System.out.println("Balancing tricycle.java");
    }
    @Override
    public void ride(Cycle a){
        System.out.println("Riding ");
        cycling();
    }
}