package thirdChapter;
import java.lang.Math;
public class Literals
{
    public static void main(String[] args)
    {

        char ch='g';
        System.out.println(Integer.toBinaryString(ch));

    }

    public void binaryGestures()
    {
        int inteLit= 0xa;
        System.out.println(Integer.toHexString(inteLit));
        System.out.println(inteLit);
        System.out.println(Integer.toBinaryString(inteLit));
        int move= 4;
        for(int i=0;i<move;i++)
        {
            System.out.println();
            inteLit >>= 1;
            System.out.println(inteLit);
            System.out.println(Integer.toBinaryString(inteLit));
        }
    }
}
