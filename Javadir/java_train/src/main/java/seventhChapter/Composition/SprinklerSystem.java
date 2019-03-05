package seventhChapter.Composition;
//:seventhChapter/Composition/SprinklerSystem.java
//Second element of composition
public class SprinklerSystem {
    private String valve1,valve2,valve3,valve4;
    private WaterSource source=new WaterSource();
    private int i;
    private float t;
//    public String toString(){
//        return "valve1="+valve1+" valve2="+valve2+" valve3="+valve3+" valve4="+valve4+"\n"+"source="+source;
//    }

    public static void main(String[] args) {
        SprinklerSystem sprinkler=new SprinklerSystem();
        System.out.println(sprinkler);
    }
}
