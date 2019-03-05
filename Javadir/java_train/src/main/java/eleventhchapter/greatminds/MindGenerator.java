package eleventhchapter.greatminds;

public class MindGenerator {
    private static String[] Minds = {"Linkoln","Cherchill","Jordison","Taylor","Mercury"};
    private static int Counter = 0;

    public int getCounter(){
        return Counter;
    }

    public static void setCounter(int counter) {
        Counter = counter;
    }


    public String next(){
        if (Counter == Minds.length){
            setCounter(0);
        }
        return Minds[Counter++];
    }
}
