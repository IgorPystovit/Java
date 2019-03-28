package twelvethchapter.exceptionlogging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class ExceptionLogger2 {
    private static Logger log = Logger.getLogger("ExceptionLogger2");
    public void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        log.severe(trace.toString());
    }

}
