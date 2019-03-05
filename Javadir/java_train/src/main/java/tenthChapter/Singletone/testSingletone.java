package tenthChapter.Singletone;

public class testSingletone {
    public static void main(String[] args) {
        Singletone[] single = new Singletone[5];
        for (int i = 0; i < single.length; ){
            System.out.println(i);
            single[i] = Singletone.getInstance();
            i++;
        }

        single[0].assureSet();
//        single[1].assureSet();
        single[2].assureSet();
//        for (Singletone a:single){
//            a.assureSet();
//        }

    }
}
