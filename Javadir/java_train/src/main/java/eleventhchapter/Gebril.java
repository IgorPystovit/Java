package eleventhchapter;

import java.util.ArrayList;

public class Gebril {
    private long getBilNumber = 0;
    public Gebril(long bilNumber){
        getBilNumber = bilNumber;
    }

    public void hop(){
        System.out.println("Gebril's bill is "+getBilNumber);
    }

    public static void main(String[] args) {
        ArrayList<Gebril> bills = new ArrayList<Gebril>();
        for (int i = 0; i < 5; i++){
            bills.add(new Gebril((long)Math.abs(Math.random()*10000)));
        }

        for (Gebril a : bills){
            a.hop();
        }
    }
}
