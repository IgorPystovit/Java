package seventhChapter.Overriding;

public class Digits {
    protected int getSome(int i){
        System.out.println("Its Integer");
        return i;
    }
    float getSome(float i){
        System.out.println("Its float point number");
        return i;
    }
    byte getSome(byte i){
        System.out.println("Its byte");
        return i;
    }
}
