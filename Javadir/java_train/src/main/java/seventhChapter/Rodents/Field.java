package seventhChapter.Rodents;

import java.util.Random;

public class Field {

   private static Rodent randomRodent = null;

    public static Rodent getRandomRodent() {
        return randomRodent;
    }

    public static void setRandomRodent(Rodent rodent){
        randomRodent = rodent;
    }

    private static Rodent spawnTheRodents(){
        switch(new Random().nextInt(2)){

            case 0: randomRodent = new Mouse();
            break;
            case 1: randomRodent = new Hamster();
            break;
            default: randomRodent = null;
        }
        return randomRodent;
    }


    public static void main(String[] args){

//        for(int i=0; i<2; i++){
//            Rodent rodent = spawnTheRodents();
//            System.out.println(rodent.getName());
//            rodent.getCharVar();
//
//            rodent.erase();
//
//        }

        Mouse obj = new Mouse();
        obj.printDescription();
     }

}
