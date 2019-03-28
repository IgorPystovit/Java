package twelvethchapter.creatingownexceptions;

public class MyException extends Exception{
    private static String ExceptionMessage;
    public MyException(){}
    public MyException(String exceptionMessage){
        ExceptionMessage = exceptionMessage;
    }
    public void printExceptionMessage(){
        System.out.println(ExceptionMessage);
    }

}
