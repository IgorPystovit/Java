package Doc_train;
//: /home/wage/Documents/1/Javadir/java_train/src/main/java/Doc_train/SeriesDelete.java

/** Program that deletes equal series of incremental numbers
 * @author Nord
 * @version 1.0.0
 * @see simpleAr
 * @docRoot
  */ 
import source.useful.simpleAr;

import static java.lang.System.exit;

public class SeriesDelete {
    /**Method that copy array indexes which refer to equal incremental series of numbers*/
    private int[] formArrayWithDeleteNumbers(int SeriesOfIncrementalNumbersArray[][],int userArray[])
    {
        SeriesDelete detectEqual = new SeriesDelete();
        simpleAr visible = new simpleAr();

        int EqualSeriesOfIncrementalNumbers[] = new int[userArray.length];

        int tempArrayBack[];
        int tempArrayForward[];
        boolean isEqualArrays=false;
        int count = 0;

        for (int n = 0; n < SeriesOfIncrementalNumbersArray.length; n++) {
            tempArrayBack = detectEqual.defineRow(userArray, SeriesOfIncrementalNumbersArray[n][0], SeriesOfIncrementalNumbersArray[n][1]);
            for (int y = n + 1; y < SeriesOfIncrementalNumbersArray.length; y++) {
                tempArrayForward = detectEqual.defineRow(userArray, SeriesOfIncrementalNumbersArray[y][0], SeriesOfIncrementalNumbersArray[y][1]);
                if (detectEqual.getArrayCompare(tempArrayBack, tempArrayForward))
                {
                    isEqualArrays=true;
                    for (int k = SeriesOfIncrementalNumbersArray[y][0]; k <= SeriesOfIncrementalNumbersArray[y][1]; k++)
                    {
                        EqualSeriesOfIncrementalNumbers[count] = k;
                        count++;
                    }
                }
            }
        }
        if(!isEqualArrays)
        {
            System.out.println("No of equal arrays were detected");
            visible.OutputOneDimensional(userArray);
            exit(0);
        }
        EqualSeriesOfIncrementalNumbers = detectEqual.finalArrayForm(EqualSeriesOfIncrementalNumbers);
        return EqualSeriesOfIncrementalNumbers;
    }
    /**@return array of indexes to delete*/

    /**Final method*/
    public int[] EqualSeriesCleaner(int incomeArray[])
    {
        System.out.println("involved");
        simpleAr visible = new simpleAr();
        SeriesDelete detectEqual = new SeriesDelete();
        SeriesDelete coreObject=new SeriesDelete();
        int SeriesOfIncrementalNumbersArray[][];
        int EqualSeriesOfIncrementalNumbers[] = new int[incomeArray.length];

        SeriesOfIncrementalNumbersArray = detectEqual.getArrayOfInternalRows(incomeArray);
        System.out.println();

        EqualSeriesOfIncrementalNumbers=coreObject.formArrayWithDeleteNumbers(SeriesOfIncrementalNumbersArray,incomeArray);
        incomeArray = detectEqual.cleanArrayOfIncrementalSeries(incomeArray, EqualSeriesOfIncrementalNumbers);
        return incomeArray;
    }
    /**@return array that doesnt contain equal series of incremental numbers*/

    /**Method that deletes equal indexes from array*/
    private int[] finalArrayForm(int copyArr[])
    {
        simpleAr convert=new simpleAr();
        boolean flag;
        int zeroCounter=0,count=0;
        int perfect[]=new int[copyArr.length];
        for(int j=0;j<copyArr.length;j++)
        {
            flag=false;
            for(int a=j+1;a<copyArr.length;a++)
            {
                if(copyArr[a]==copyArr[j])
                {
                    flag=true;
                    break;
                }
            }
            if(!flag){
                perfect[count]=copyArr[j];
                count++;
            }
        }
        for(int h=0;h<perfect.length;h++)
        {
            if(h!=0 && perfect[h]==0){
                zeroCounter++;
            }
        }

        perfect=convert.convertONE(perfect,zeroCounter);

        return perfect;
    }
  /**@return array with no equal numbers*/

  /**Method that deletes equal series of incremental numbers*/
    private int[] cleanArrayOfIncrementalSeries(int userArray[],int copy[])
    {
        int finalArray[]=new int[userArray.length-copy.length];
        int countForFinal=0;
        boolean flag;
        for(int h=0;h<userArray.length;h++)
        {
            flag=false;
            for(int j=0;j<copy.length;j++)
            {
                if(h==copy[j])
                {
                    flag=true;
                    break;
                }
            }

            if(flag){
                continue;
            }

            finalArray[countForFinal]=userArray[h];
            countForFinal++;
        }
        return finalArray;
    }
    /**@reurn final formed array*/
    /**public Compare two arrays*/
    public boolean getArrayCompare(int arr[], int arr2[]) {
        boolean equalSize = arr.length == arr2.length ? true : false;
        if (!equalSize) {
            return false;
        } else {
            boolean isEqual = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    isEqual = false;
                    return isEqual;
                }
            }
        }
        return true;
    }
   /**@return TRUE if arrays are equal*/
   /** form two dimensional array contains of begin/end indexes of series of incremental numbers*/
    private int[][] getArrayOfInternalRows(int arr[]) {
        SeriesDelete row = new SeriesDelete();
        int rownum = 0;
        int amount = 0;
        for (; rownum < arr.length - 1; rownum++) {


            if ((rownum > 0) && ((arr[rownum] - arr[rownum - 1] == 1) && (arr[rownum + 1] - arr[rownum] != 1))) {
                amount++;
                continue;
            }
            if ((rownum == arr.length - 2) && (arr[rownum + 1] - arr[rownum] == 1)) {
                amount++;
            }
        }

        rownum = 0;
        int tempSave[][] = new int[amount][2];
        int i = 0;
        for (; rownum < arr.length - 1; rownum++) {
            if ((rownum == 0 && arr[rownum + 1] - arr[rownum] == 1) || row.getRowStarNumber(arr,rownum)) {
                tempSave[i][0] = rownum;
            }


            if ((rownum > 0) && ((arr[rownum] - arr[rownum - 1] == 1) && (arr[rownum + 1] - arr[rownum] != 1))) {
                tempSave[i][1] = rownum;
                i++;
                continue;
            }
            if ((rownum == arr.length - 2) && (arr[rownum + 1] - arr[rownum] == 1)) {
                tempSave[i][1] = rownum + 1;
                i++;
            }
        }

        return tempSave;
    }
    /**@return  two dimensional array contains of begin/end indexes of series of incremental numbers*/

    private boolean getRowStarNumber(int arr[], int num) {
        if ((num > 0) && (arr[num] - arr[num - 1] != 1) && (arr[num + 1] - arr[num] == 1))
        {
            return true;
        }   else{
            return false;
        }
    }
    /** define array by his begin/end indexes*/
    private int[] defineRow(int arr[],int start,int end)
    {
        int formArray[]=new int[(end-start)+1];
        int num=0;
        for(int j=start;j<=end;j++)
        {
            formArray[num]=arr[j];
            num++;
        }
        return formArray;
    }
    /**@return one dimensional array*/
    ///:~
}

