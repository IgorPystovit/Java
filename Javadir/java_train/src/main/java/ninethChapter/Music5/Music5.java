package ninethChapter.Music5;
import java.util.Random;
public class Music5 {
    private static Random rnm = new Random();
    private static Playable instance = null;

    public void tune(Playable a){
        a.play();
    }

    public void tuneAll(Playable[] orchestra){
        for(Playable a:orchestra){
            a.play();
        }
    }

    public Playable getRandomInstrument(){
        switch(rnm.nextInt(5)){
            case 0:
                instance = new Stringer();
                break;
            case 1:
                instance = new Wind();
                break;
            case 2:
                instance = new Woodwind();
                break;
            case 3:
                instance = new Percussion();
                break;
            case 4:
                instance = new Guitar();
                break;
            case 5:
                instance = new Brass();
                break;
            default:
                instance = null;
        }
        return instance;
    }

    public static void main(String[] args) {
        Music5 obj = new Music5();
        Playable[] orchestra = new Playable[5];
        for (int i = 0; i < orchestra.length; i++){
            orchestra[i] = obj.getRandomInstrument();
        }

        obj.tuneAll(orchestra);
    }
}
