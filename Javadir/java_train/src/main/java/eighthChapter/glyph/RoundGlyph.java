package eighthChapter.glyph;

public class RoundGlyph extends Glyph{
    public int radius = 1;

    public RoundGlyph(int r){
        radius = r;
        draw();
    }

    @Override
    public void draw(){
        System.out.println("RoundGlyph.draw(radius),radius="+radius);
    }
}
