package seventhChapter.Shapes;

//:seventhChapter/Shapes/Triangle.java
public class Triangle extends Shape{
    @Override
    protected void draw(){
        System.out.println("Triangle draw");
    }

    @Override
    protected void erase(){
        System.out.println("Erase triangle");
    }

    @Override
    protected void printMessage(){
        System.out.println("Print message by triangle");
    }
}//:~
