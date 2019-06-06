package package71;

/**
 * @ClassName Practice9
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/21 14:17
 * @Version 1.0
 */

class AException extends Exception {

}

class BException extends Exception {

}


public class Practice9 {

    static void f() throws AException {
        throw new AException();
    }

    static void g() throws BException {
        try {
            f();
        } catch (AException e) {
            e.printStackTrace();
            throw new BException();
        }
    }


    public static void main(String[] args) {
        try {
            g();
        } catch (BException e) {
            e.printStackTrace();
        }
    }
}
