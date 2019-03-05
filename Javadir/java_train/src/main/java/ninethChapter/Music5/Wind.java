package ninethChapter.Music5;

//:seventhChapter/Music3/Percussion.java

public class Wind extends Instrument{

    private String name = "Wind";

    @Override
    public String getName(){
        return name;
    }


    public void play(){
        System.out.println("Wind.play()");
    }

    @Override
    public void adjust() {
        System.out.println("Wind.adjust()");
    }
}//:~
