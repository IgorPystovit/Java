package tenthChapter.eventhandler;

public class HandlerExe {
    public static void main(String[] args) {
       LightHandler lh = new LightHandler();
       Event[] events = {lh.new LightOn(100),lh.new LightOff(200)};
       lh.addEvent(lh.new SetEventMode(500,events));
       lh.run();

    }
}
