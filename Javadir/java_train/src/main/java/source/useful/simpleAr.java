package source.useful;
//: /home/wage/Documents/1/Javadir/java_train/src/main/java/Doc_train/SeriesDelete
import java.util.Scanner;
public class simpleAr {

    private int sizeHeight,sizeWifth;

    public int getSizeHeight() {
        return sizeHeight;
    }

    public void OutputTwoDimensional(int array[][])
    {
        simpleAr universeObject=new simpleAr();

        for(int i=0;i<array.length;i++)
        {
            universeObject.OutputOneDimensional(array[i]);
        }
    }
    public void fillWithInput(int[] arr)
    {
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
    }
    public void OutputOneDimensional(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public int[] convert(int right[],int rightTwo[],int left[])
    {

        left=new int[right.length+rightTwo.length];
        return left;
    }


    public int goToEnd(int arr[],int kickNum) {
        simpleAr jk = new simpleAr();
        int amoi=0;
        for (int a = 0; a < arr.length; a++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == kickNum) {
                    int temp = arr[i];
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    arr[arr.length - 1] = temp;
                    amoi++;
                }

            }
        }
        System.out.println("amoi="+amoi);
        return amoi;
    }

    public int[] convertONE(int right[],int deleteNum)
    {
        int left[];
        left=new int[right.length-deleteNum];
        for(int i=0;i<left.length;i++)
        {
            left[i]=right[i];
        }

        return left;
    }
    public int[] getCopyofTWO(int startAr1[],int startAr2[],int copyAr[])
    {
        simpleAr obj=new simpleAr();
        int i=-1,tempo=0;
        copyAr=obj.convert(startAr1,startAr2,copyAr);
        for(;i<copyAr.length;)
        {
            i++;
            if(tempo==startAr1.length) {
                tempo=0;
                for(;i<copyAr.length;i++)
                {
                    copyAr[i]=startAr2[tempo];
                    tempo++;
                }
                break;
            }
            copyAr[i]=startAr1[tempo];


            tempo++;
        }
        return copyAr;
    }



}