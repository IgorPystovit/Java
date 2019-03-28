package twelvethchapter.creatingownexceptions;

public class ExceptionHandler {
    public int n = 0;
    public static int increaseN(ExceptionHandler eh) throws MyException{
           int innerValueOfN = 0;
           try{
               innerValueOfN = ++eh.n;
           }catch (NullPointerException nullPointer){
               System.out.println("NullPointerException has been caught");
               eh = new ExceptionHandler();
               innerValueOfN = ++eh.n;
           }
            System.out.println(innerValueOfN);
           return innerValueOfN;
    }
    public static void main(String[] args) throws Exception{
        ExceptionHandler eh = new ExceptionHandler();
        System.out.println(increaseN(eh));
    }
}
