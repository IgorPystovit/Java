package seventhChapter.Music3;

public class Guitar extends Stringer {
    private String name = "Guitar";

    public String getName(){
        return name;
    }

    @Override
    protected void play(){
        System.out.println("Guitar.play()");
    }

    @Override
    protected void adjust(){
        System.out.println("Guitar.adjust()");
    }

}
