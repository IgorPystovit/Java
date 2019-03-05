package seventhChapter.Shapes;

public class Circle extends Shape{
    @Override
    protected void draw(){
        System.out.println("Circle draw");
    }

    @Override
    protected void erase(){
        System.out.println("Erase circle");
    }
}
