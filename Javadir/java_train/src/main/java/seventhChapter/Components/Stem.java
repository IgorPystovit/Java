package seventhChapter.Components;

//seventhChapter/Components/Stem.java
public class Stem extends Root{
    Stem(int i){
        Component1 c1=new Component1(i);
        Component2 c2=new Component2(i);
        Component3 c3=new Component3(i);System.out.println("Stem constructor");
    }

    void erase(){
        super.erase();
    }
    public static void main(String[] args) {
        try{
            //
        }finally {
            new Stem(2).erase();
        }
    }

}
