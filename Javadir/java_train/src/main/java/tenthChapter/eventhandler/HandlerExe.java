package tenthChapter.eventhandler;

public class HandlerExe {
    public static void main(String[] args) {
        GreenhouseHandler lh = new GreenhouseHandler();
        lh.addEvent(lh.new BellRing(Long.parseLong("10000000000")));
        Event[] events = {
                lh.new LightOn(Long.parseLong("2000000000")),
                lh.new WaterOn(Long.parseLong("3000000000")),
                lh.new SetThermostatDay(Long.parseLong("5000000000")),
                lh.new WaterOff(Long.parseLong("6000000000")),
                lh.new LightOff(Long.parseLong("7000000000")),
                lh.new SetThermostatNight(Long.parseLong("8000000000")),
        };
        lh.addEvent(lh.new SetEventMode(Long.parseLong("12000000000"),events));
        lh.run();
    }
}
