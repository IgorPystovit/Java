package seventhChapter.Music3;
//seventhChapter/Music3/Brass.java
public class Brass extends Wind{
    private String name = "Brass";

    @Override
    protected String getName(){
        return name;
    }

    @Override
    protected void play(){
        System.out.println("Brass.play()");
    }

    @Override
    protected void adjust() {
        System.out.println("Brass.adjust()");
    }
}//:~
