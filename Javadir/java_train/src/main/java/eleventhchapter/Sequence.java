package eleventhchapter;

import java.util.ArrayList;
import java.util.Collection;

public class Sequence {
    private ArrayList<Object> objArray = new ArrayList<Object>();

    public void add(Object fillElement){
        objArray.add(fillElement);
    }

    private class SequenceSelector implements Selectable{
        private int counter = 0;
        public boolean end(){
            return counter == objArray.size();
        }

        public Object current(){
            return objArray.get(counter);
        }

        public void next(){
            counter++;
        }
    }

    public Selectable getSelector(){
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence seq = new Sequence();
        Selectable select = seq.getSelector();
        for (int i = 0; i < 10; i++){
            seq.add(Integer.toString(i));
        }

        for (Object i:seq.objArray){
            System.out.println(i);
        }

        System.out.println();

        while(!select.end()){
            System.out.println(select.current());
            select.next();
        }
    }


}
