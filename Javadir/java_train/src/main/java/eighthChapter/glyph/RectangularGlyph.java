package eighthChapter.glyph;

public class RectangularGlyph extends Glyph{
    public int sideA;
    public int sideB;

    public RectangularGlyph(int a, int b){
        sideA = a;
        sideB = b;
        draw();
    }

    public void draw(){
        System.out.println("RectangularGLyph.draw(side A, side B). sideA = "+sideA+" sideB = "+sideB);
    }
}
