package tenthChapter.eventhandler;

public class HandlerExe {
    public static void main(String[] args) {
        LightHandler lh = new LightHandler();
        Event[] events = {lh.new LightOn(Long.parseLong("2000000000")),lh.new LightOff(Long.parseLong("3000000000"))};
        lh.addEvent(lh.new SetEventMode(Long.parseLong("4000000000"),events));
        lh.run();
    }
}
