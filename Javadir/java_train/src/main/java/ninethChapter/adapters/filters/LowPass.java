package ninethChapter.adapters.filters;

public class LowPass{
    public FilterAdapter getFilter(){
        return new FilterAdapter(){
            public String getName(){
                return getClass().toString();
            }

            public Waveform process(Waveform input){
                return input;
            }
        };
    }
    private double lowPass;
    public LowPass(double lowPass){
        this.lowPass = lowPass;
    }


}
