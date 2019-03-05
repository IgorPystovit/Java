package Fiveth_Chapter;

public class Tank {
    boolean full;
    public void toFill(){
        full=true;
    }
    public void toEmpty(){
        full=false;
    }


    public void finalize(){
        if(!full){
            System.out.println("Finalizing's in process");
            System.gc();
        }else
            System.out.println("Tank isn't empty");
    }

    public static void main(String[] args) {
        Tank tanker=new Tank();
        tanker.toFill();
        tanker.finalize();
        tanker.toEmpty();
        tanker.finalize();
    }
}
