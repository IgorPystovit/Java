package ninethChapter.adapters;

import java.awt.event.ActionEvent;
import ninethChapter.adapters.filters.FilterAdapter;
import ninethChapter.adapters.filters.LowPass;
import ninethChapter.adapters.filters.Waveform;

public class Apply {
    public static void process(Processable wayOfSolve,Object input){
        System.out.println("Using Apply.process()");
        System.out.println("Way of solve "+wayOfSolve.toString());
        System.out.println(wayOfSolve.process(input));
    }



    public static String example = "I know them minds";
    public static void main(String[] args) {
        UpperCase uc = new UpperCase();

        process(new UpperCase(){
            @Override
            public Object process(Object input) {
                return "Its new process";
            }
        },"String");
    }
}
