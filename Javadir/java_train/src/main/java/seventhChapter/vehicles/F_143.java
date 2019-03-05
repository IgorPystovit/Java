package seventhChapter.vehicles;

public class F_143 extends Plane{
    @Override
    public void useMotor(){
        System.out.println("F-143 plane motor is used ");
    }

    public String dynamicGet(){
        return super.dynamicGet();
    }

}
