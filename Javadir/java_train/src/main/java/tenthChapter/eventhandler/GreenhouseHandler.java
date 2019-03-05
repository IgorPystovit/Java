package tenthChapter.eventhandler;

import java.util.ArrayList;

public class GreenhouseHandler extends Handler{
    public static long counter = 0;
    ArrayList<Event> eventList = new ArrayList<Event>();
    public GreenhouseHandler(){
    }

    private boolean water = false;
    public class WaterOff extends Event{
        public WaterOff(){}
        public WaterOff(long delayTime){
            super(delayTime);
        }

        public void eventAction(){
            water = false;
        }

        public String toString(){
            return "Water's off";
        }
    }

    //WaterOn
    public class WaterOn extends Event{
        public WaterOn(){}
        public WaterOn(long delayTime){
            super(delayTime);
        }

        public void eventAction(){
            water = false;
        }

        public String toString(){
            return "Water's on";
        }
    }


    private String thermostatState = "";
//    public class Checker extends Event{
//            public
//    }

    public String getThermostatState(){
        return thermostatState;
    }
    public void setThermostatState(String thermostatState) {
        this.thermostatState = thermostatState;
    }
    //
    public class SetThermostatDay extends Event{
        private MoistureSupplyOn mson = new MoistureSupplyOn();
        public SetThermostatDay(long delayTime){
            super(delayTime);

        }
        public SetThermostatDay(){}

        public void eventAction(){
            thermostatState = "Day";
            mson.eventAction();
            System.out.println(mson);
        }

        public String toString(){
            return "Thermostat is set to day time";
        }
    }

    public class SetThermostatNight extends Event{
        private MoistureSupplyOff msoff = new MoistureSupplyOff();
        public SetThermostatNight(long delayTime){
            super(delayTime);
        }

        public SetThermostatNight(){}

        public void eventAction(){
            thermostatState = "Night";
            msoff.eventAction();
            System.out.println(msoff);
        }

        public String toString(){
            return "Thermostat is set to night time";
        }
    }


    private boolean light = false;
    public class LightOn extends Event{

        public LightOn(long delayTIme){
            super(delayTIme);
        }

        public LightOn(){}

        @Override
        public void eventAction() {
            light = true;
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
            light = false;
        }

        public String toString(){
            return "Light's off";
        }
    }


    public class BellRing extends Event{

        public BellRing(long delayTime){
            super(delayTime);
        }

        public BellRing(){}

        public void eventAction(){
            addEvent(new BellRing(delayTime));
        }

        public String toString(){
            return "Bell's ringing";
        }

    }


    public class ProcessTermination extends Event{
        private boolean condition = false;

        public ProcessTermination(boolean condition){
            this.condition = condition;
        }

        public void eventAction(){
            if (condition){
                System.exit(0);
            }
        }

        public String toString(){
            return "";
        }
    }


    private boolean waterMist = false;

    public class MoistureSupplyOn extends Event{
        public MoistureSupplyOn() {
        }

        @Override
        public void eventAction() {
            waterMist = true;
            toString();
        }

        public String toString(){
            return "Moisture supply enabled";
        }
    }


    public class MoistureSupplyOff extends Event{
        public MoistureSupplyOff(){
        }

        @Override
        public void eventAction() {
            waterMist = false;
            System.out.println();
        }

        public String toString(){
            return "Moisture supply disabled";
        }
    }



    public static long dayCounter = 0;
    public class SetEventMode extends Event{
        private Event[] eventList;
        public SetEventMode(long delayTime,Event[] eventList){
            super(delayTime);
            this.eventList = eventList;
            for (Event e:eventList) {
                addEvent(e);
                e.startAt();
            }
            startAt();
        }

        public SetEventMode(){}

        public void eventAction(){
            for (Event e:eventList){
                addEvent(e);
                e.startAt();
            }

            dayCounter++;
            addEvent(new GreenhouseHandler().new ProcessTermination(dayCounter >= 2));
            addEvent(this);
            startAt();
        }

        public String toString(){
            return "Event mode is set";
        }
    }

}
