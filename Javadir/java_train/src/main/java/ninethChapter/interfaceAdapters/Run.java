package ninethChapter.interfaceAdapters;
import java.util.*;
public class Run {
    public static void process(Readable a){
        Scanner scan = new Scanner(a);

        while (scan.hasNext()){
            System.out.println(scan.next());
        }
    }

    public static void main(String[] args) {
        process(new RandomDoubleAdapter(new RandomDouble(2)));

    }
}
