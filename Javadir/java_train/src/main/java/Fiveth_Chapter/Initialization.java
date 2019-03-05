package Fiveth_Chapter;

public class Initialization {
    static int enCounter=0;



    Initialization(){
       enCounter+=1;
       System.out.println(enCounter);
   }

    static int i=5;
    public void InitialValue(int y){
        y=i+3;
        System.out.println(y);
    }

    public void InitialValue2(int h){
        h=++i;
        System.out.println(h);

    }
    public int f(int j){
        return j;
    }

    void printInitial(){
        InitialValue(i);
        InitialValue2(i);
    }

    public static void main(String[] args) {
    }
}
