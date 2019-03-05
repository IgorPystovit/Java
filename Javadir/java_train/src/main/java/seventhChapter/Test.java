package seventhChapter;

public class Test {
    Test(){
        System.out.println("Test");
    }
    private int a;
    int getField(){
        return a;
    }

    void setField(int a){
        this.a=a;
    }
    void testMethod(Object obj){
        System.out.println(obj);
    }
}
