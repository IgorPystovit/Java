package ninethChapter.adapters;

public class StringProcessor implements Processable{
    public String getName(){
        return getClass().getSimpleName();
    }

    public Object process(Object input){
        return input;
    }
}
