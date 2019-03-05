package ninethChapter.fabricalMethod.venturousGames;
import java.util.*;
public class PlayGames {
    private static Scanner scan = new Scanner(System.in);
    public static void play(VenturableFactory gameFactory){
        Venturable game = gameFactory.getVenture();
        System.out.println("You are now playing "+game.getName());
        String listener = "";
        System.out.println("Enter \"Yes\" if you want to drop, otherwise enter \"No\"");
        listener = scan.nextLine();
        while (listener.equals("Yes")){
            System.out.println("You dropped "+game.drop());
            System.out.println("Continue?");
            listener = scan.nextLine();
        }
        System.out.println("You have finished playing "+game.getName());
    }

    public static void main(String[] args) {
        play(DropTheCoin.CoinFactory);
    }
}
