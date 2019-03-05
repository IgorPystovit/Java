package Fiveth_Chapter;
import java.lang.Throwable;
public class Links {
    boolean check=false;
    void invoke(boolean checkIn){
        check=checkIn;
    }
    @Override
    protected void finalize(){
        if(!check) {
            System.out.println("Finalized");
//            super.finalize();
        }
    }
    Links linker;
    Links link;
    void printLinks(){
        System.out.println("Reference = "+this.link);
    }
    public static void main(String[] args) {
        Links linkObj=new Links();
        System.out.println("linker="+linkObj.linker);
        linkObj.printLinks();
        System.out.println("link="+linkObj);
    }

}
