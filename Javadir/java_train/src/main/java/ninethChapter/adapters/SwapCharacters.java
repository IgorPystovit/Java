package ninethChapter.adapters;

public class SwapCharacters {


            public Processable getProcessable(){
                return new Processable() {
                    public String getName(){
                        return getClass().getSimpleName();
                    }

                    public String process(Object input){

                        char[] charRepresent ;
                        charRepresent = ((String)input).toCharArray();
                        int tempLength = 0;

                        if (charRepresent.length % 2 != 0){

                            tempLength = charRepresent.length - 2;

                        }else{

                            tempLength = charRepresent.length - 1;

                        }

                        for (int i = 0; i <= tempLength; i+=2) {
                            char temp = charRepresent[i];
                            charRepresent[i] = charRepresent[i + 1];
                            charRepresent[i + 1] = temp;
                        }
                        return String.valueOf(charRepresent);
                    }
                };
            }




}
