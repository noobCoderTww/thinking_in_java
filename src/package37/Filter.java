package package37;

import package36.Waveform;

/**
 * @ClassName Fileter
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/19 10:25
 * @Version 1.0
 */

public class Filter {

    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
