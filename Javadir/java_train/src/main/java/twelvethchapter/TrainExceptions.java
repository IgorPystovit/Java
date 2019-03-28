package twelvethchapter;

import twelvethchapter.creatingownexceptions.MyException;

import java.util.logging.Logger;

public class TrainExceptions {
    private static Integer[] array = new Integer[5];

    public void fillArray(){
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
    }

    private static String getObjectType(Object obj){
        char[] charRepresentation = obj.getClass().getSimpleName().toCharArray();
        String objectType = "";
        for (char iTempChar : charRepresentation){
            if (Character.isLetter(iTempChar)){
                objectType += iTempChar;
            }
        }
        return objectType;
    }

    public void fillByIndex(int index,Object fillObject) throws IndexOutOfBoundsException, ClassCastException {

        if ((index >= 0) && (index < array.length)) {
            if (fillObject instanceof Integer){
                array[index] = (Integer)fillObject;
            }else{
                throw new ClassCastException("Try to fill array with object of wrong type: Required "+getObjectType(array)+";"+" Found: "+fillObject.getClass().getSimpleName());
            }
        }else{
            throw new IndexOutOfBoundsException("Index "+index);
        }
    }

    public void printArray(){
        for (Integer iTemp : array){
            System.out.print(iTemp+" ");
        }
    }
    public void randomMethod() throws MyException{
        System.out.println("randomMethod()");
        throw new MyException();
    }

    public static void randomMethod(String outputMessage){
        System.out.println(outputMessage);
    }

    private int checkIndex(int index) throws IndexOutOfBoundsException{
        if (index < 10){
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        System.out.println(index);
        return index;
    }


    private int increaseIndex(int index){
        return ++index;
    }
    public static void main(String[] args) {
        int index = 4;
        TrainExceptions te = new TrainExceptions();
            try{
                te.fillByIndex(3,"l");
            }catch (IndexOutOfBoundsException boundsException){
                System.out.println("Catch block");
                boundsException.printStackTrace(System.err);
            }catch (Exception anyException){
                System.out.println("Catch exception block");
                System.err.println(anyException.getMessage());
                anyException.printStackTrace();
            }

//        System.out.println(te.checkIndex(index));
    }
}
