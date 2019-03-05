package ninethChapter.Music5;


//:seventhChapter/Music3/Percussion.java
public class Percussion extends Instrument {
    private String name = "Percussion";

    @Override
    public String getName(){
        return name;
    }
    public void play(){
        System.out.println("Percussion.play()");
    }

    @Override
    public void adjust(){
        System.out.println("Percussion.adjust()");
    }
}//:~
