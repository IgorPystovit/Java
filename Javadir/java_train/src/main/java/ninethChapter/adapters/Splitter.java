package ninethChapter.adapters;

import java.util.Arrays;

public class Splitter extends StringProcessor {
    public String getName(){
        return getClass().getSimpleName();
    }

    public String process(Object input){
        return Arrays.toString(((String)input).split(""));
    }
}
