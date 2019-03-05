package ninethChapter.adbstraction;

public class Derivative extends Root {
    private int identity= 12;

    public void print() {
        System.out.println(identity);
    }

    public static void run(Root a){
        ((Derivative)a).print();
    }

    public static void main(String[] args) {
        run(new Derivative());
    }
}
