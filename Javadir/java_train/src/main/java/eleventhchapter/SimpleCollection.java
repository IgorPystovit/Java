package eleventhchapter;

import java.util.*;

public class SimpleCollection {
    private static SimpleCollection sc = new SimpleCollection();
    public void printAll(Collection<Integer> list){
        for (Object obj:list){
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        Collection<Integer> sint = new ArrayList<Integer>(Arrays.asList(5,6,7,8,9));
        sint.addAll(Arrays.asList(5,4,2,1));
        sc.printAll(sint);
    }
}
