package ninethChapter.adapters.filters;

public class Waveform {
    public static long counter = 0;
    public final long id = counter++;

    public String getName(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString(){
        return "Waveform "+id;
    }

}
