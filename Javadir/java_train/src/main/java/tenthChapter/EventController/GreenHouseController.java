package tenthChapter.EventController;

public class GreenHouseController {
    public static void main(String[] args) {
        GreenhouseControl gControl = new GreenhouseControl();
//        gControl.addEvent(gControl.new Bell(100));
        Event[] events = {
                gControl.new Bell(Long.parseLong("1000000000")),
                gControl.new WaterOn(Long.parseLong("2000000000")),
//                gControl.new LightOn(Long.parseLong("3000000000")),
//                gControl.new SetThermostatDay(Long.parseLong("4000000000")),
//                gControl.new SetThermostatNight(Long.parseLong("5000000000")),
//                gControl.new WaterOff(Long.parseLong("6000000000")),
//                gControl.new LightOff(Long.parseLong("7000000000")),
//                gControl.new Bell(Long.parseLong("8000000000")),
        };
        gControl.addEvent(gControl.new Reset(Long.parseLong("4000000000"),events));

        if (args.length == 1){
            gControl.addEvent(new GreenhouseControl.Terminate(new Integer(args[0])));
        }
        gControl.run();

    }
}
