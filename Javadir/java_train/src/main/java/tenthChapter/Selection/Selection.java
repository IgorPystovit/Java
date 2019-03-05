package tenthChapter.Selection;

public class Selection {

    Determine detRef ;
    int argNum = 0;

    public Selection(){}
    public Selection(int arg,Determine detRef){
        argNum = arg;
        this.detRef = detRef;
        complex();
    }

    interface mathOperationsFactory{
        Determine getMathOp();
    }
    public void complex(){
        caller(detRef,argNum);
    }
    public static void caller(Determine detInstance,int arg){
        detInstance.defineCall(arg);
    }

    private static class Increment implements Determine{
        public void defineCall(int i){
            i++;
            System.out.println(i);
        }

//        public static mathOperationsFactory moFactory = new mathOperationsFactory() {
//            public Determine getMathOp() {
//                return new Increment();
//            }
//        };

    }

    private static class Decrement implements Determine{
        public void defineCall(int i){
            i--;
            System.out.println(i);
        }

//        public static mathOperationsFactory moFactory = new mathOperationsFactory() {
//            public Determine getMathOp() {
//                return new Decrement();
//            }
//        };
    }

    private static class Mult implements Determine{
        public void defineCall(int i){
            i*=i;
            System.out.println(i);
        }

//        public static mathOperationsFactory moFactory = new mathOperationsFactory() {
//            public Determine getMathOp() {
//                return new Mult();
//            }
//        };
    }



    public static void main(String[] args) {
        Determine[] mathOperations=new  Determine[]{new Mult(),new Increment(),new Decrement()};
        for (Determine a:mathOperations){
            caller(a,3);
        }

    }
}
