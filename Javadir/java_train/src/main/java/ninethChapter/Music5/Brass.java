package ninethChapter.Music5;

//seventhChapter/Music3/Brass.java
public class Brass extends Wind{
    private String name = "Brass";

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void play(){
        System.out.println("Brass.play()");
    }

    @Override
    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}//:~
