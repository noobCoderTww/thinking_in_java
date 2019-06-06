package package42;


/**
 * @ClassName Processor
 * @Description 适配器模式
 * @Author tanwenwei
 * @Date 2019/4/19 14:48
 * @Version 1.0
 */
public interface Processor {
    String name();

    Object process(Object input);
}


class Waveform {
    public static int count = 0;

    public final int id;

    public Waveform() {
        this.id = count++;
    }

    @Override
    public String toString() {
        return "Waveform " + id;
    }

}


class Filter {

    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform waveform) {
        return waveform;
    }
}

class FilterAdapter implements Processor {

    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

class T1 {

}