package twelvethchapter.exceptionlogging;

public class ExceptionLogger3 extends Exception {
    private int val = 0;

    public ExceptionLogger3(){}

    public ExceptionLogger3(String msg){
        super(msg);
    }

    public ExceptionLogger3(String msg,int val){
        super(msg);
        this.val = val;
    }

    public int getVal(){
        return val;
    }

    public String toString(){
        return "ExceptionLogger3: "+getVal()+" "+getMessage();
    }

}
