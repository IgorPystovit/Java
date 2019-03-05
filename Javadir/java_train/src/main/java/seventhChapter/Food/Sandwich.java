package seventhChapter.Food;

public class Sandwich implements MakingSandwich {
    Bread b = new Bread();
    Cheese c = new Cheese();
    Lettuce l = new Lettuce();
    Pickle p = new Pickle();
    Sandwich(){
        System.out.println("Sandwich()");
    }
    public void cheeseSandwich(Cheese pieceOfCheese){
        System.out.println("Sandwich.cheeseSandwich()");
    }

    public void saladSandwich(Lettuce amountOfLettuce){
        System.out.println("Sandwich.saladSandwich()");
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich();
        sandwich.cheeseSandwich(sandwich.c);
    }
}
