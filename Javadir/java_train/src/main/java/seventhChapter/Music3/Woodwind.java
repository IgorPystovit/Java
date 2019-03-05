package seventhChapter.Music3;

//:seventhChapter/Music3/Woodwind.java
public class Woodwind extends Wind{

    private String name = "Woodwind";

    @Override
    protected String getName(){
        return name;
    }
    @Override
    protected void play(){
        System.out.println("Woodwind.play()");
    }

    @Override
    protected void adjust() {
        System.out.println("Woodwind.adjust()");
    }
}//:~
