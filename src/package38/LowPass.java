package package38;

import package36.Waveform;
import package37.Filter;

/**
 * @ClassName LowPass
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/19 10:29
 * @Version 1.0
 */

public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform waveform) {
        return waveform;
    }
}
