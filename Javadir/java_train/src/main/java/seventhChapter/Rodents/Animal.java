package seventhChapter.Rodents;

//import sun.security.krb5.internal.crypto.Des;

import seventhChapter.refCounter.Link;

public class Animal {
//    private Description d = new Description("Animal",new Link("Description","Animal"),"Animal");
    private Characteristic c = new Characteristic("Not plant");
    private String name;

    public Animal(String name){
        System.out.println("Animal()");
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String arg){
        name = arg;
    }




    public void erase(){
        System.out.println("erase() Animal");
//        d.erase();
        c.erase();
        setName("");
    }
}
