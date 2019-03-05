package thirdChapter;

public class equalAddress
{
    public static void main(String[] args)
    {
      Dog spot=new Dog();
      Dog scruffy=new Dog();
        spot.name="spot";
        scruffy.name="scruffy";
        spot.says="argh";
        scruffy.says="omph";
      Dog testDog=new Dog();
      spot=testDog;
        System.out.println(spot==scruffy);
        System.out.println(spot.equals(testDog));
    }
}
