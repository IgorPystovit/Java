package tenthChapter.thirdPackage;

import tenthChapter.innerClassesNUpcast.StringsManage;
import tenthChapter.linkBetween.Concat;

public class Release extends StringsManage {
   private int i = 0;

   private void setField(int i){
       this.i = i;
   }

   private int getField(){

       return i;
   }

   public class Inner{
       private void test(){
           setField(5);
           System.out.println(getField());
       }
   }

   public Release.Inner gerInner(){
       return new Inner();
   }


    public static void main(String[] args) {
        StringsManage sm = new StringsManage();
//        Concat con =sm.getConcate();
//        System.out.println(((Concate)con).conc);
    }
}
