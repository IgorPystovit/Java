package seventhChapter.vehicles;

//:seventhChapter/vehicles/Plane.java
public class Plane extends Vehicle {
    public static String staticGet(){
        return "sub staticGet";
    }

    @Override
    public void callStatic(){
        System.out.println(staticGet());
    }

    private int Field = 1;




    public String dynamicGet(){
        return " ";
    }

    public int getField(){
        return Field;
    }
    public Plane(){
        System.out.println("Constructor Plane");
    }

    private String motorsState;

    public String getMotorsState() {
        return motorsState;
    }

    public void setMotorsState(String motorsState) {
        this.motorsState = motorsState;
    }

    //first
    public void fly(){
       useMotor();
    }

    //second
    public void useMotor(){
        System.out.println("Type of motor of plane specified");
    }

}
