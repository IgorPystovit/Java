package tenthChapter.Unsign;
import java.util.ArrayList;
import java.util.Scanner;
public class Bsign {
//    private static int arrayNum = 0;
    private ArrayList<Signable> signs = new ArrayList<Signable>();

    public Bsign(){}

    public void setSign(Signable s){
            signs.add(s);
    }

    public Asign getAsignRef(){
        return new Asign();
    }
    public void eraseSign(int signNum){
        if ( (signNum >= 0) && (signNum < signs.size())){
            signs.remove(signNum);
        }else {
            System.out.println("Out_of_Bound_ListException");
        }
    }

    public void drawSign(ArrayList<Signable> signList){
        for (Signable s : new ArrayList<Signable>(signList)){
            s.makeSign();
        }
//        for (int i = 0; i < signList.size(); i++){
//            signList.get(i).makeSign();
//        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Asign as = new Asign();
        String itemp;

        //Signable-type array creation
        Bsign bs = new Bsign();

        for (int i = 0;; i++){
            itemp = scan.next();
            if (itemp.equals("0")){
                break;
            }
            bs.setSign(as.getUnsigned(itemp));

        }

        bs.drawSign(bs.signs);
        System.out.println("Erase num");
        int eraseNum = scan.nextInt();
        bs.eraseSign(eraseNum);
        bs.drawSign(bs.signs);
    }




}
