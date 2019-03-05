package ninethChapter.Music5;


public class Guitar extends Stringer {
    private String name = "Guitar";

    public String getName(){
        return name;
    }

    @Override
    public void play(){
        System.out.println("Guitar.play()");
    }

    @Override
    public void adjust(){
        System.out.println("Guitar.adjust()");
    }

}
