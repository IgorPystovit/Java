package ninethChapter.Music5;

//:seventhChapter/Music3/Woodwind.java
public class Woodwind extends Wind{

    private String name = "Woodwind";

    @Override
    public String getName(){
        return name;
    }

    public void play(){
        System.out.println("Woodwind.play()");
    }

    @Override
    public void adjust() {
        System.out.println("Woodwind.adjust()");
    }
}//:~
