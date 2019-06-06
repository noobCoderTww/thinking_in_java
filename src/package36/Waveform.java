package package36;

/**
 * @ClassName Waveform
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/19 10:22
 * @Version 1.0
 */

public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform " + id;
    }
}
