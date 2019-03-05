package tenthChapter;

public class Extension extends Outer{
    public int intValue = 9;
    public void print(){
        System.out.println("Extension");
    }
    public class Inner2{
        public void innerMethod(){
            print();
            creator(3);
        }
    }
}
