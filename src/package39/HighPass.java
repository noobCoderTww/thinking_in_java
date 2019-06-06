package package39;

import package36.Waveform;
import package37.Filter;

/**
 * @ClassName HighPass
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/19 10:30
 * @Version 1.0
 */

public class HighPass extends Filter {

    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform waveform) {
        return waveform;
    }


}
