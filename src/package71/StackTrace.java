package package71;

/**
 * @ClassName StackTrace
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/20 17:00
 * @Version 1.0
 */

public class StackTrace {

    static void f() throws Exception {
        throw new Exception();
    }


    static void g() throws Exception {
        f();
    }


    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            for (var i : e.getStackTrace()) {
                System.out.println(i.getMethodName());
            }
        }

        try {
            g();
        } catch (Exception e) {
            for (var i : e.getStackTrace()) {
                System.err.println(i);
            }
        }
    }

}
