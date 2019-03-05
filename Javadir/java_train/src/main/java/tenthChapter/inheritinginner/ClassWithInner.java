package tenthChapter.inheritinginner;

public class ClassWithInner {
    public ClassWithInner(int i){
        System.out.println("ClassWithInner "+i);
    }

    public void add(int arg){
        System.out.println("Add "+arg+1);
    }
    public class Inner{
        public Inner(int i){
            System.out.println("Inner");
            add(i);
        }
    }
}
