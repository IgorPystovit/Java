package ninethChapter.adapters.filters;

public class BandPass extends ProcessingWater{
    private double lowCutoff;
    private double highCutOff;

    public BandPass(double lowCutoff,double highCutOff){
        this.highCutOff = highCutOff;
        this.lowCutoff = lowCutoff;
    }

    public String getName(){
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input){
        return input;
    }
}
