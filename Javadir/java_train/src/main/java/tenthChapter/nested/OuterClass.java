package tenthChapter.nested;

import tenthChapter.innerClassesNUpcast.*;

public class OuterClass {

    private static class Nested implements StringManageService {
        private String str1,str2;
        Nested(String string1, String string2){
            str1 = string1;
            str2 = string2;
        }
        public Object stringProcessing() {
            return str1+str2;
        }
    }

    public StringManageService getNested(String string1, String string2){
        return new Nested(string1,string2);
    }

    public static void main(String[] args) {

    }
}
