package package68;

/**
 * @ClassName Event
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/29 11:41
 * @Version 1.0
 */

public abstract class Event {

    private long eventime;

    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventime;
    }


    public abstract void action();
}
