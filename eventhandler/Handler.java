package tenthChapter.eventhandler;

public class Handler {
    private static int counter = 0;
    private Object[] eventList ;

    public Handler(int size){
        eventList = new Object[size];
    }

    public Handler(){}

    public void setSize(int size){
        eventList = new Object[size];
    }
    public void add(Object a){
        eventList[counter] = a;
        counter++;
    }

    public Object[] copy(Object[] array){
        Object[] ar = new Object[array.length];
        for (int i = 0; i < ar.length; i++){
            ar[i] = array[i];
        }
        return ar;
    }

    public void remove(Object a){
        for (int i = 0; i < eventList.length; i++){
            if (eventList[i] == a){
                eventList[i] = 0;
                return;
            }
        }
    }

    public void run(){
        for(Object a:copy(eventList)){
            System.out.println(a);
        }
    }
}
