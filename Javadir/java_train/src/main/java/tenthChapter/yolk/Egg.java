package tenthChapter.yolk;

public class Egg {

    public Egg(){
        System.out.println("Egg");
    }
    public class Yolk{
        public Yolk(){
            System.out.println("Egg.Yolk()");
        }

        public void f(){
            System.out.println("Egg.Yolk.f()");
        }
    }

    Yolk y = new Yolk();
    public void insertYolk(Egg.Yolk yy){
        y = yy;
    }

    public void g(){
        y.f();
    }


}
