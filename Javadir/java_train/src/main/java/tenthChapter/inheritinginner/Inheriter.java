package tenthChapter.inheritinginner;

public class Inheriter {
    public class Child extends ClassWithInner.Inner{
        public Child(int i,ClassWithInner ar){
            ar.super(i);
            System.out.println("Ar.super");
        }
    }

    public static void main(String[] args) {
        Inheriter obj = new Inheriter();
        Inheriter.Child childObj = obj.new Child(5,new ClassWithInner(5));
    }
}
