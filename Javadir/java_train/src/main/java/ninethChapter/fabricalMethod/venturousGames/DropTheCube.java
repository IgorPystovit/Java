package ninethChapter.fabricalMethod.venturousGames;

import java.util.Random;

public class DropTheCube implements Venturable{
    public DropTheCube(){
    }

    public String getName(){
        return "@DROP THE CUBE@";
    }

    public Integer drop(){
        return new Random().nextInt(6) + 1;
    }

    public static VenturableFactory CubeFactory = new VenturableFactory() {
        public Venturable getVenture() {
            return new DropTheCube();
        }
    };
}
