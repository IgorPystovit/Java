package seventhChapter.Inheritance;
///seventhChapter/Inheritance/Detergent.java
//extension of Cleaner.java
public class Detergent {
    private static Cleaner clean=new Cleaner();
    Detergent(){
        super();
        System.out.println("Detergent constructor");
    }
    public void scrub() {
        clean.append(" Detergent.scrub()");
        clean.scrub();
    }

    public void apply(){
        clean.apply();
    }

    public void dilute(){
        clean.dilute();
    }

    public String toString(){
       return clean.toString();
    }
    public void foam(){
        clean.append(" foam()");
    }

    public static void main(String[] args) {
        clean.dilute();
        Detergent extension=new Detergent();
        extension.foam();
        extension.scrub();
        extension.apply();
        extension.dilute();
        System.out.println(extension);
        System.out.println(args);
        Cleaner.main(args);
    }
}///:~
