package tenthChapter.anonymousClasses;

import tenthChapter.innerClassesNUpcast.StringManageService;

public class Parcel {
      public StringCorrector getStringCorrector(String string){
          return new StringCorrector(string){
            public String getString(){
                return super.getString() + " correct";
            }
          };
      }

    public static void main(String[] args) {
        Parcel pr = new Parcel();
        StringCorrector sc = pr.getStringCorrector("wall");
        System.out.println(sc.getString());
    }
//    private class StringLength implements StringManageService{
//        private String tempString = "";
//        private StringLength(String string){
//            tempString = string;
//        }
//        public Integer stringProcessing(){
//            return tempString.length();
//        }
//    }
//
//    public StringManageService getLength(String tempString){
//        return new StringLength(tempString);
//    }



}
