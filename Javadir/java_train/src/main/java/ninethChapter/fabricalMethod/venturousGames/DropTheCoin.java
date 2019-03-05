package ninethChapter.fabricalMethod.venturousGames;

public class DropTheCoin implements Venturable{
    Venturable DropTheCoin;
    public DropTheCoin(){
    }

    public String getName(){
        return "@DROP THE COIN@";
    }
    public String drop(){
        String sideOfCoin = "";
        switch ((int)Math.round(Math.random())){
            case 0:
                sideOfCoin = "Eagle";
                break;
            case 1:
                sideOfCoin = "Tails";
                break;
            default:
                sideOfCoin = "Edge";
        }
        return sideOfCoin;
    }

    public static VenturableFactory CoinFactory = new VenturableFactory() {
        public Venturable getVenture() {
            return new DropTheCoin();
        }
    };

}
