package thirdChapter;

public class Ternary {

    public static void main(String[] args) {
        boolean x=true;
        System.out.println(x&&false);
        System.out.println(x&false);
        int k=3>5?up(3):up(5);
        System.out.println(k);
    }
    public static int up(int arg){
        return arg*arg;
    }
}

