package seventhChapter.vehicles;

public class Test extends Vehicle{

    public static void adjust(Plane type){
        type.fly();
    }


    public static void main(String[] args) {
        F_143 plane = new F_143();
        System.out.println(plane.dynamicGet());
    }
}
