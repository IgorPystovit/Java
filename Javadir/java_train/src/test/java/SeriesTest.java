import Doc_train.SeriesDelete;
import source.useful.simpleAr;
public class SeriesTest {
    public static void main(String[] args) {
        simpleAr array=new simpleAr();
        SeriesDelete delete=new SeriesDelete();
        int testArray[]=new int[7];
        System.out.println("start");
        array.fillWithInput(testArray);
        testArray=delete.EqualSeriesCleaner(testArray);
        array.OutputOneDimensional(testArray);
    }
}
