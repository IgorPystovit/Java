package seventhChapter.Rodents;

import seventhChapter.refCounter.Link;

//:seventhChapter/Rodents/Hamster.java
public class Hamster implements Rodent{
    private static final String name = "Hamster";

//    private Description d = new Description("red-colored",new Link("Description","Hamster"),"Hamster");

    private Characteristic c =new Characteristic("Has a big cheeks");


    public Hamster(){
        System.out.println("Hamster()");
    }

    public void erase(){
        System.out.println("erase() Hamster");
//        d.erase();
        c.erase();
    }

    public String what() {
        return "Hamster";
    }

    public void toGnaw(){
        System.out.println("Hamster.toGnaw()");
    }
}//:~
