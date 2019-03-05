package seventhChapter.Shapes;

public class ExeShape {
    private static ShapeGenerator gen=new ShapeGenerator();
    private static ExeShape exe=new ExeShape();
    private static Shape[] ShapeBox = new Shape[6];
    public static void main(String[] args) {
        try {

            for (Shape a : ShapeBox) {
                a = gen.next();
                a.draw();
                a.printMessage();
            }


        }finally{
            for (Shape a:ShapeBox){

            }
        }

    }

    protected void finaliz(Shape obj){
        System.gc();
        obj.erase();
    }
}
