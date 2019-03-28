package twelvethchapter.exceptionlogging;

public class TestLog {

    private static void logTester() throws ExceptionLogger1{
        System.out.println("Calling ExceptionLogger1 from logTester");
        throw new ExceptionLogger1();
    }

    private static void logTester3() throws ExceptionLogger3{
        System.out.println("Calling ExceptionLogger3 from logTester3");
        throw new ExceptionLogger3("Called from logTester3",3);
    }

    public static void main(String[] args) {
        try{
//            logTester();
            logTester3();
//        }catch (ExceptionLogger1 el1){
//            System.out.println("Caught "+el1);
        }catch (NullPointerException nullPointer){
            new ExceptionLogger2().logException(nullPointer);
        }catch (ExceptionLogger3 el3){
            el3.printStackTrace(System.out);
            System.err.println(el3);
        }
    }
}
