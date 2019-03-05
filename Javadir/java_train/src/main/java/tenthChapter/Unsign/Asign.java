package tenthChapter.Unsign;

public class Asign {

    public Asign(){
    }

    public Signable getUnsigned(final String iTemp){
        final String sign = iTemp;
        return new Signable() {
            public void makeNoise() {
                System.out.println("A noise");
            }

            public void makeSign() {
                System.out.println(sign +" made");
            }


            public void signal() {
                System.out.println("Draw A signal");
            }
        };
    }
}
