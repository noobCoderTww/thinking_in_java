package package65;

/**
 * @ClassName Outer
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/28 9:06
 * @Version 1.0
 */

public class Outer {

    class Inner {
        // static int i = 0;  普通内部类不能有static的字段。
        private int i = 0;  //只能有普通的字段

       /* public static void m1() {

        }*/  //也不能含有static 的方法
    }
}
