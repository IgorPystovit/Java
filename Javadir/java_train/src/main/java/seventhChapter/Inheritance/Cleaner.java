package seventhChapter.Inheritance;

///seventhChapter/Inheritance/Cleaner.java
public class Cleaner {

    private String s;

    public void append(String a){
        s+=a;
    }
    public void scrub(){
        append(" scrub()");
    }

    public void dilute(){
        append(" dilute()");
    }

    public void apply(){
        append(" apply()");
    }
    public String toString(){ return s; }

    public static void main(String[] args) {
        Cleaner clean=new Cleaner();
        clean.apply();
        clean.dilute();
        clean.scrub();
//        Cleaner.main(args);
        System.out.println(clean);
    }
}///:~
