package tenthChapter.yolk;

public class BigEgg extends Egg{
    public BigEgg(){
        System.out.println("BigEgg");
        insertYolk(new Yolk());
    }

    public class Yolk extends Egg.Yolk{
        public Yolk(){
            System.out.println("BigEgg.Yolk()");
        }

        public void f(){
            System.out.println("BigEgg.Yolk.f()");
        }
    }

    public static void main(String[] args) {
        Egg e = new BigEgg();
        e.g();
    }
}
