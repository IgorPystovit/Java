package seventhChapter.FinalInitialization;

public class Blank {
    private final SheetOfPaper Blanks;
    Blank(int i){
        Blanks=new SheetOfPaper(i);
    }

    Blank(){
        Blanks=new SheetOfPaper(1);
    }

    public static void main(String[] args) {
        Blank newBlank=new Blank();
        Blank Blank2=new Blank(2);

    }
}
