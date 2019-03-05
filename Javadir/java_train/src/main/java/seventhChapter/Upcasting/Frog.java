package seventhChapter.Upcasting;
import static source.useful.Print.*;
public class Frog extends Amphibian{
    private String name;
    private String voice;


    public Frog(String name,String voice){
        super(name,voice);
        this.voice=voice;
        this.name=name;

    }

    public void scream(){
        super.scream();
        System.out.println("Frog Screams");
    }

    public static void recognition(Amphibian spec){
        System.out.println("Frog recognition");
       spec.scream();
    }

    public String toString(){
        return "Named "+name+"\n"+"Voiced "+voice;
    }
    public static void main(String[] args) {

        Frog specimen=new Frog("Frog ","Squeak");
        recognition(specimen);
        print(specimen.toString());
    }

}
