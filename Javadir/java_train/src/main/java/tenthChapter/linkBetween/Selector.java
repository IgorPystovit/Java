package tenthChapter.linkBetween;

public interface Selector {
    boolean end();
    Object current();
    void next();
    Object reverseSelector();
}
