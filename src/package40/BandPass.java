package package40;

import package36.Waveform;
import package37.Filter;

/**
 * @ClassName BandPass
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/19 10:30
 * @Version 1.0
 */

public class BandPass extends Filter {

    double lowCutoff, highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }


    @Override
    public Waveform process(Waveform waveform) {
        return waveform;
    }
}
