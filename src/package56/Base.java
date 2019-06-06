package package56;

/**
 * @ClassName Base
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/24 9:12
 * @Version 1.0
 */

public class Base {

    public static Base getExport() {
        return new Export();
    }

    public void m1() {
    }

}

class Export extends Base {

    @Override
    public void m1() {
        System.out.println(111);
    }
}
