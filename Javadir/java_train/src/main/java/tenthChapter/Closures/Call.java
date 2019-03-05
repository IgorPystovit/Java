package tenthChapter.Closures;

public class Call {
    private  Incrementable callBackref;
    public Call(Incrementable cbr){
        callBackref = cbr;
    }
    public void go(){
        callBackref.increment();
    }
}
