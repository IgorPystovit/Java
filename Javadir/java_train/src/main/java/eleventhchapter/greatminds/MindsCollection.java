package eleventhchapter.greatminds;

import java.util.*;

public class MindsCollection {
    private static MindGenerator mg = new MindGenerator();
    public static Collection fill(Collection collection){
        for (int i = 0; i < 5; i++){
            collection.add(mg.next());
        }
        return collection;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
    }
}
