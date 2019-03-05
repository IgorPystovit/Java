package seventhChapter.Upcasting;

public class Amphibian {
    private String name;
    private String exampleOfVoice;
    public Amphibian(String name,String voice){
        this.name=name;
        this.exampleOfVoice=voice;
    }

    public void scream(){
        System.out.println("Screaming "+exampleOfVoice);
    }

    public static void recognition(Amphibian spec){
        spec.scream();
    }
    public String toString(){return "Name="+name+"\n"+"Voice="+exampleOfVoice;}
}
