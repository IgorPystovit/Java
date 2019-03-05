package eighthChapter.glyph.spaceShip;

public class Starship {
    public AlertStatus alert = new AlertStatus();
    public void changeStatus(AlertStatus newStatus){
        alert = newStatus;
    }

    public void getStatus(){
        alert.performStatus();
    }

}
