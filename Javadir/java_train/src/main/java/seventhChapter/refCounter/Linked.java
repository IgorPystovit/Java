package seventhChapter.refCounter;

public class Linked {
    public static long counter = 0;

    public final long id = counter++;
    private String linkTo = "usable class id";
    private String linkFrom = "user class id";
    public Link link;
    public Linked(Link link){
        this.link = link;
//        System.out.println("Creating a Reference "+this.link.getLinkFrom()+"-->"+this);
        this.link.addRef();
    }


    public void dispose(){
        System.out.println("Disposing Linked "+id);
        link.finalize();
    }
    @Override
    public String toString(){
        return "Linked "+id;
    }
}
