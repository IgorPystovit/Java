package tenthChapter.eventhandler;

public class LightHandler extends Handler{

    public LightHandler(int size){
        super(size);
    }

    public LightHandler(){}

    private int light = 0;
    public class LightOn extends Event{
        public LightOn(long delayTIme){
            super(delayTIme);
        }
        public LightOn(){}
        @Override
        public void eventAction() {
            light = 1;
        }

        public String toString(){
            return "Light's on";
        }
    }

    public class LightOff extends Event{
        public LightOff(long delayTIme){
            super(delayTIme);
        }
        public LightOff(){}
        @Override
        public void eventAction() {
            light = 0;
        }

        public String toString(){
            return "Light's off";
        }
    }

    public class setEventMode extends Event{
        private Event[] eventList;
        public setEventMode(long delayTime,Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            eventAction();
        }


        public void eventAction(){
            for (Event e:eventList){
                add(e);
            }
        }

        public String toString(){
            return "Event mode is set";
        }
    }

}
