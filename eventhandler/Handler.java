package tenthChapter.eventhandler;

import java.util.ArrayList;

public class Handler {

    private ArrayList<Event> eventList = new ArrayList<Event>();
    public Handler(){

    }

    public void addEvent(Event ev){
        eventList.add(ev);
    }

    public void run(){
        while (eventList.size() > 0){
            for (Event ev : new ArrayList<Event>(eventList)){
                if (ev.isReady()){
                    ev.eventAction();
                    System.out.println(ev);
                    eventList.remove(ev);
                }
            }
        }
    }
}
