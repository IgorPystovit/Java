package seventhChapter.Music3;

import java.util.*;
public class Music3 {
    private static Random rnmNum=new Random();


    public static void tune(Instrument a){
        a.play();
    }

    public static void tuneAll(Instrument[] orchestra){
        for (Instrument k:orchestra){
            tune(k);
        }
    }

    private static void toString(Instrument a){
        System.out.println(a.getName()+" is currently selected");
    }

    public static Instrument getRandomInstrument(){
        switch (rnmNum.nextInt(6)){
            default:
            case 0: return new Percussion();
            case 1: return new Wind();
            case 2: return new Stringer();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Guitar();
        }
    }
    public static void main(String[] args) {


        Instrument[] orchestra=new Instrument[5];

        //fill orchestra with Random instruments
        for (int i=0; i<orchestra.length; i++){
            orchestra[i]=getRandomInstrument();
        }

        tuneAll(orchestra);

    }
}
