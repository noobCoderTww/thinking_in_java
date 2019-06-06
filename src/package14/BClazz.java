package package14;

/**
 * @ClassName BClazz
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/7 15:37
 * @Version 1.0
 */

public class BClazz {


    public final int b = 1;

    public static void main(String[] args) {
        System.out.println(new BClazz().m());
    }

    public int m() {
        int c;
        c = b;
        return ++c;
    }
}
