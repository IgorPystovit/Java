package seventhChapter.Rodents;


import seventhChapter.refCounter.Link;

//Parental class
//:seventhChapter/Rodents/Rodent.java
public interface Rodent{

//     Description d = new Description("Can live in house  ",new Link("Description","Rodent"),"Rodent");
     Characteristic c = new Characteristic("Can live on the field also");

     void erase();

     String what();
     void toGnaw();


}//:~
