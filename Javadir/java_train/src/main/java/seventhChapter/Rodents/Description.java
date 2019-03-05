package seventhChapter.Rodents;

import seventhChapter.refCounter.Link;

public class Description {
    private static long counter = 0;
    private static final long id = counter++;
    private String desVar;
    private String userClass;
    public Link link;


    public Description(String desVar, Link link,String userClass){
        this.userClass = userClass;
        setDesVar(desVar);
        this.link = link;
        this.link.addRef();
        System.out.println("\n"+"Creating "+userClass+" "+this);
        System.out.println("Creating a description "+getDesVar()+"\n");
    }

    public String getDesVar(){
        return desVar;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public void setDesVar(String desVar){
        this.desVar = desVar;

    }

    @Override
    public String toString(){
        return "Description "+id;
    }
    public void erase(){
        link.finalize();
        System.out.println("Erasing "+id);
        System.out.println("Erasing description "+getDesVar());
        setDesVar("");
    }


}
