package seventhChapter.Music3;
//:seventhChapter/Music3/Stringer.java
public class Stringer extends Instrument{

    private String name="Stringer";

    @Override
    protected String getName(){
        return name;
    }
    @Override
    protected void play(){
        System.out.println("Stringer.play()");
    }

    @Override
    protected void adjust() {
        System.out.println("Stringer.adjust()");
    }
}//:~
