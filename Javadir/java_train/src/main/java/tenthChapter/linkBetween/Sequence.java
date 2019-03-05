package tenthChapter.linkBetween;
import java.util.Scanner;
public class Sequence {
    private static Scanner scan = new Scanner(System.in);
    private Object[] array;
    private int controlNum = 0;

    public Sequence(int size) {
        array = new Object[size];

    }


    public void add(Object content) {
        array[controlNum++] = content;
    }

    private class SelectorSequence implements Selector {
        private int counter = 0;

        public boolean end() {
            return counter == array.length;
        }

        public Object current() {
            return array[counter];
        }

        public Object reverseSelector(){
            return array[(array.length-1)-counter];
        }
        public void next() {
            if (counter < array.length) {
                counter++;
            }
        }
    }

    public Sequence.SelectorSequence getSelector() {
        return new SelectorSequence();
    }

    public static void main(String[] args) {

        Sequence sequence = new Sequence(9);
        System.out.println("Iteration");
        for (int i = 0; i < sequence.array.length; i++){
            sequence.add(Integer.toString(i));
        }

        Selector select = sequence.getSelector();
        System.out.println("Output");
        while (!select.end()){
            System.out.println(select.reverseSelector());
            select.next();
        }
    }

}
