package seventhChapter.Upcasting;

public class MoreSub extends SubStatic{

    MoreSub(){
        System.out.println("MoreSub()");
    }
    @Override
    public String dynamicGet(){
        return "MoreSub version of dynamicGet()";
    }
}
