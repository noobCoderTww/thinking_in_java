package package71;

/**
 * @ClassName GuessException
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/21 15:12
 * @Version 1.0
 */

class WriException extends Exception {
}


public class GuessException {

    public static void main(String[] args) {
        try {
            f();
        } catch (WriException e) {
            e.printStackTrace();
        }

    }


    static void f() throws WriException {
        try {
            throw new WriException();
        } catch (RuntimeException e) {
            System.out.println(555);
        } finally {
            System.out.println(123);
        }
    }

    static void g() throws Exception {
        throw new Exception();
    }


    static void h() throws Exception {

        try {
            g();
        } catch (Exception e) {
            throw new Exception();
        } finally {
            System.out.println(456);
        }

    }

    private static class Inner1 {

        public static void main(String[] args) {
            try {
                h();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
