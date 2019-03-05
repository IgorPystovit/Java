package seventhChapter.refCounter;

public class Composing extends Reff{
    Link link = new Link();
    ReferenceCounting id = new ReferenceCounting(link);
    public static void main(String[] args) {
        new Composing();
    }

//    public static long counter = 0;
//
//    public final long id = counter++;
//
//    public Link link;
//    public Composing(Link link){
//        this.link = link;
//        System.out.println("Creating a Reference "+this.link.getLinkFrom()+"-->"+this);
//        this.link.addRef();
//    }
//
//
//    public void dispose(){
//        System.out.println("Disposing "+this);
//        link.finalize();
//    }
//    @Override
//    public String toString(){
//        return "Composing "+id;
//    }
}
