package package71;

/**
 * @ClassName Rethrowing
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/20 17:34
 * @Version 1.0
 */

public class Rethrowing {


    static void f() throws Exception {
        throw new Exception();
    }

    static void g() throws Exception {

        try {
            f();
        } catch (Exception e) {

            for (var i : e.getStackTrace()) {
                System.err.print(i.getMethodName() + " ");
            }
            System.out.println("------------------");
            throw e;
        }
    }

    static void h() throws Exception {

        try {
            f();
        } catch (Exception e) {
            for (var i : e.getStackTrace()) {
                System.err.print(i.getMethodName() + " ");
            }
            System.out.println("--------------------");
            throw (Exception) e.fillInStackTrace();
        }

    }


    public static void main(String[] args) {
        try {
            g();
        } catch (Exception e) {
            for (var i : e.getStackTrace()) {
                System.err.print(i.getMethodName() + " ");
            }
        }
        System.out.println("-----------------------");
        try {
            h();
        } catch (Exception e) {
            for (var i : e.getStackTrace()) {
                System.err.print(i.getMethodName() + " ");
            }
        }
        System.out.println("-----------------------");
    }
}
