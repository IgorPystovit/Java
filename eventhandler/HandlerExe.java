package tenthChapter.eventhandler;

public class HandlerExe {
    public static void main(String[] args) {
       LightHandler lh = new LightHandler();
       Event[] events = {lh.new LightOn(100),lh.new LightOff(200)};
       lh.setSize(events.length);
//       lh.add(events[0]);
       lh.new setEventMode(500,events);
       lh.run();

    }
}
