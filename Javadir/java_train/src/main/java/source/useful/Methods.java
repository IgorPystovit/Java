package source.useful;
import java.lang.Math;
public class Methods {
    public static int[] range(int toNumber){
        int array[]=new int[toNumber];
        for(int i=0;i<toNumber;i++){
            array[i]=i;
        }
        return array;
    }
    public static int[] range(int fromNumber,int toNumber){
      int size=toNumber-fromNumber;
      int array[]=new int[size];
      for(int i=0;i<size;i++){
          array[i]=fromNumber+i;
      }
          return array;
    }

    public static int[] range(int fromNumber,int toNumber,int step) {
     float size=(toNumber-fromNumber)/step;
     int array[]=new int[Math.round(size)];
     for(int i=0;i<Math.round(size);i++){
         fromNumber+=step;
         array[i]=fromNumber;
     }
     return array;
    }


    }
