package ninethChapter.adapters.filters;


import ninethChapter.adapters.Processable;

public class FilterAdapter implements Processable {


    public String getName(){
        return getClass().getSimpleName();
    }

    public Waveform process(Object input){
        return (Waveform)input;
    }
}
