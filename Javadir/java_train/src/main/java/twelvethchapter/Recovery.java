package twelvethchapter;
import java.util.*;
import java.lang.*;
public class Recovery {
    private static Scanner scan = new Scanner(System.in);
    private Integer[] intArray = new Integer[5];
    private int index = 0;

    public Recovery(){
        for (int i = 0; i < intArray.length; i++){
            intArray[i] = i;
        }
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setIndex(){
        index = scan.nextInt();
    }


    private int checkIndex(int index){
//        if (index < 0){
//            return 0;
//        }
        while (index < 0){
            index++;
        }

//        if (index >= intArray.length){
//            return intArray.length-1;
//        }
        while (index >= intArray.length){
            index--;
        }

        return index;
    }

    public Integer read() {
        Integer readValue = 0;
        try{
            readValue = intArray[getIndex()];
        }catch (IndexOutOfBoundsException outOfBounds){
            System.out.println("IndexOutOfBounds");
            readValue = intArray[checkIndex(getIndex())];
        }catch (Exception e){
            System.err.println("Exception");
            e.printStackTrace();
        }
        return readValue;
    }

    public static void main(String[] args) {
        Recovery recovery = new Recovery();
        recovery.setIndex(9);
        System.out.println(recovery.read());
    }
}
