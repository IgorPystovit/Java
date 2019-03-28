package twelvethchapter.exceptionlogging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;
import java.util.logging.Logger;

public class ExceptionLogger1 extends Exception{
    private static Logger log = Logger.getLogger("ExceptionLogger1");
    public ExceptionLogger1(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        log.severe(trace.toString());
    }

}
