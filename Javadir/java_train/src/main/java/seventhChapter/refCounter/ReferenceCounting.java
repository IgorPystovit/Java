package seventhChapter.refCounter;

public class ReferenceCounting {
    public Link link;
    private long counter = 0;
    private final long id = counter++;
    public ReferenceCounting(Link link){
        System.out.println("Creating ReferenceCounting "+this);
        this.link = link;
        this.link.addRef();
    }

    public void finalize(){
        System.out.println("Disposing "+this);
        link.finalize();
    }
    public String toString(){
        return "ReferenceCounting "+id;
    }
}
