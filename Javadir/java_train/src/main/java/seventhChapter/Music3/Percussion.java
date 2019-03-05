package seventhChapter.Music3;

//:seventhChapter/Music3/Percussion.java
public class Percussion extends Instrument{
    private String name = "Percussion";

    @Override
    protected String getName(){
        return name;
    }
    @Override
    protected void play(){
        System.out.println("Percussion.play()");
    }

    @Override
    protected void adjust(){
        System.out.println("Percussion.adjust()");
    }
}//:~
