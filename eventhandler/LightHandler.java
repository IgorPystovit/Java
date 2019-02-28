package tenthChapter.eventhandler;

import java.util.ArrayList;

public class LightHandler extends Handler{
    ArrayList<Event> eventList = new ArrayList<Event>();
    public LightHandler(){
    }


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


    public class SetEventMode extends Event{
        private Event[] eventList;
        public SetEventMode(long delayTime,Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            eventAction();
            startAt();
        }

        public SetEventMode(){}

        public void eventAction(){
            for (Event e:eventList){
                addEvent(e);
                startAt();
            }
            startAt();
            addEvent(this);
        }

        public String toString(){
            return "Event mode is set";
        }
    }

}
