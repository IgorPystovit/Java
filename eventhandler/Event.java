package tenthChapter.eventhandler;

public abstract class Event {
    public long delayTime = 0;
    private long eventTime = 0;
    public Event(long delayTime){
        this.delayTime = delayTime;
        startAt();
    }

    public Event()
    {}
    public void startAt(){
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean isReady(){
        return eventTime <= System.nanoTime();
    }

    public abstract void eventAction();
}
