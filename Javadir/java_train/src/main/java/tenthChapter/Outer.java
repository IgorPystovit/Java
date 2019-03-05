package tenthChapter;

public class Outer {
    class Inner{
        private int innerValue = 0;
        public Inner(int innerValue){
            this.innerValue = innerValue;
        }

        public int getInnerValue()
        {
            return innerValue;
        }
    }

    public  Inner creator(int innerValue){
        return new Inner(innerValue);
    }
    public static void main(String[] args) {
        Outer.Inner k = new Outer().creator(5);
        System.out.println(k.getInnerValue());
    }
}
