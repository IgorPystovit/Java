package seventhChapter.Cycles;

public class Cycle {
    public Cycle(){
        System.out.println("Constructor cycle");
    }


    private void cycling(){
        System.out.println("Cycle");
    }

    public void ride(Cycle a){
        System.out.print("Riding ");
        a.cycling();
    }



}
