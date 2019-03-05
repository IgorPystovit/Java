package tenthChapter.Closures;

public class AnonClasses{
    private static int counterRefer = 0;
    public static Incrementable getIncrement(final int intValue){
        return new Incrementable() {
            int intValueCopy = intValue;
            {
                System.out.println("Reference No "+counterRefer);
            }
            public void increment() {
                System.out.println(++intValueCopy);
            }
        };
    }

    public static void main(String[] args) {

        Incrementable a = getIncrement(1);
        System.out.println(a);
        Incrementable b = getIncrement(10);
        System.out.println(b);

        for (int i = 0; i < 10; i++){
            a.increment();
        }
    }
}
