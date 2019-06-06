/**
 * @ClassName TestPrivate
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/3/31 16:00
 * @Version 1.0
 */

public class TestPrivate {

    private TestPrivate() {
        System.out.println();
    }

    static TestPrivate getInstance() {
        return new TestPrivate();
    }
}

class TestProctected {

}