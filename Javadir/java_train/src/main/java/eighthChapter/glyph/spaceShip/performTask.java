package eighthChapter.glyph.spaceShip;

public class performTask {
    public static void main(String[] args) {
        Starship ship = new Starship();
        ship.getStatus();
        ship.changeStatus(new Out_of_FuelAlert());
        ship.getStatus();
    }
}
