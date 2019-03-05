package seventhChapter.refCounter;

public class Link {
    public static long counter = 0;
    public int refcounter = 0;
    public final long id = counter++;


    public Link(){

        System.out.println("Creating "+this);
    }

    public void addRef(){
        refcounter++;
    }

    public void finalize(){
        if (--refcounter == 0){
            System.gc();
        }else{
            System.out.println("This type object is still in use");
        }

    }

    @Override
    public String toString(){
        return "Link "+id;
    }

//    public static void main(String[] args) {
//        Link[] shareArray = new Link[5];
//        for (int i = 0; i < shareArray.length; i++){
//            shareArray[i] = new Link();
//            shareArray[i].addRef();
//            System.out.println(shareArray[i].toString());
//        }
//    }
}
