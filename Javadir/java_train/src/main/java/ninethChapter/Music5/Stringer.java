package ninethChapter.Music5;

//:seventhChapter/Music3/Stringer.java
public class Stringer extends Instrument{

    private String name="Stringer";

    @Override
    public String getName(){
        return name;
    }
    public void play(){
        System.out.println("Stringer.play()");
    }

    @Override
    public void adjust() {
        System.out.println("Stringer.adjust()");
    }
}//:~
