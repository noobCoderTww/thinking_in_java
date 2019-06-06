package package71;

/**
 * @ClassName ExceptionChain
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/21 10:39
 * @Version 1.0
 */

public class ExceptionChain {

    static void f() throws Exception {
        throw new Exception();
    }

    static void g() {

    }

    static void h() {

    }

    public static void main(String[] args) {
        try {

            try {
                f();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
