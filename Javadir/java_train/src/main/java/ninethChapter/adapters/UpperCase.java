package ninethChapter.adapters;


import ninethChapter.interfaceExtension.Process;

public class UpperCase extends StringProcessor {
    public String getName(){
        return getClass().getSimpleName();
    }

    public Processable getProcess(){
        return new UpperCase(){
            @Override
            public Object process(Object input) {
                return super.process(input) + "NEW";
            }
        };
    }
    public Object process(Object input){
        return ((String)input).toUpperCase();
    }
}
