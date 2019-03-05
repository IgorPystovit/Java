package seventhChapter.Music3;

//:seventhChapter/Music3/Percussion.java

public class Wind extends Instrument{

    private String name = "Wind";

    @Override
    protected String getName(){
        return name;
    }

    @Override
    protected void play(){
        System.out.println("Wind.play()");
    }

    @Override
    protected void adjust() {
        System.out.println("Wind.adjust()");
    }
}//:~
