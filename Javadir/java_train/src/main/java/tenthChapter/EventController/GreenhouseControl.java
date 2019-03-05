package tenthChapter.EventController;

import java.math.BigInteger;

public class GreenhouseControl extends Controller{
    private boolean water = false;
    public class WaterOff extends Event{
        public WaterOff(long delayTime){
            super(delayTime);
        }

        public void action(){
            addEvent(new WaterOff(delayTime));
            water = false;
        }

        public String toString(){
            return "Water's off";
        }
    }

    public class WaterOn extends Event{
        public WaterOn(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new WaterOn(delayTime));
            water = true;
        }

        public String toString(){
            return "Waters's on";
        }
    }

    private boolean light = false;

    public class LightOff extends Event{
        public LightOff(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new LightOff(delayTime));
            light = false;
        }

        public String toString(){
            return "Light's off";
        }
    }

    public class LightOn extends Event{
        public LightOn(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new LightOn(delayTime));
            light = true;
        }

        public String toString(){
            return "Light's on";
        }

    }



    private String thermostatState = "Day";
    public class SetThermostatDay extends Event{
        public SetThermostatDay(long delayTime){
            super(delayTime);
        }

        public void action(){
            addEvent(new SetThermostatDay(delayTime));
            thermostatState = "Day";
        }

        public String toString(){
            return "Thermostat is set to day time";
        }
    }



    public class SetThermostatNight extends Event{
        public SetThermostatNight(long delayTime){
            super(delayTime);
        }

        public void action(){
            addEvent(new SetThermostatNight(delayTime));
            thermostatState = "Night";
        }

        public String toString(){
            return "Thermostat is set to night time";
        }
    }

    public class Bell extends Event{

        public Bell(long delayTime){
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString(){
            return "Bell's ringing!";
        }
    }

    public class Reset extends Event{
        private Event[] eventList;
        public Reset(long delayTime,Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            action();
//            for (Event e:eventList){
//                addEvent(e);
//            }
        }

        @Override
        public void action() {
            for (Event ev:eventList){
//                ev.start();
                addEvent(ev);
            }
//            start();
//            addEvent(this);
        }

        public String toString(){
            return "All processes are reset";
        }
    }

    public static class Terminate extends Event{
        public Terminate(long delayTime){
            super(delayTime);
        }

        public void action(){
            System.exit(0);
        }

        public String toString(){
            return "process termination";
        }
    }




}
