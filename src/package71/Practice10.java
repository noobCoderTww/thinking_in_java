package package71;

/**
 * @ClassName Practice10
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/21 14:27
 * @Version 1.0
 */

class CException extends Exception {

}

class DException extends RuntimeException {

}


public class Practice10 {
    static void f() throws CException {
        throw new CException();
    }

    static void g() {

        try {
            f();
        } catch (CException e) {
            e.printStackTrace();
            throw new DException();
        }
    }

    public static void main(String[] args) {
        g();
    }
}
