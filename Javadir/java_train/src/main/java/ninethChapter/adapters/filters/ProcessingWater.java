package ninethChapter.adapters.filters;

import ninethChapter.adapters.Processable;

public class ProcessingWater{
    Waveform wave;
    public String getName(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform wave){
        return wave;
    }
}
