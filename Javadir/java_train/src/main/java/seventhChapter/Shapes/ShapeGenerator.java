package seventhChapter.Shapes;

import java.util.*;
//:seventhChapter/Shapes/ShapeGenerator.java
public class ShapeGenerator {
    private static Random ranNum=new Random();
    public Shape next(){
        switch (ranNum.nextInt(4)){
            default:
            case 1:
                return new Square();

            case 2:
                return new Triangle();

            case 3:
                return new Circle();

        }
    }
}//:~
