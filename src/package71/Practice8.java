package package71;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @ClassName Practice8
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/20 14:20
 * @Version 1.0
 */

public class Practice8 {

    private static Logger logger = Logger.getLogger("Practice8");

    static void m1(Exception e) {
        var sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        logger.severe(sw.toString());
    }

    static void method(int x) throws Exception1, Exception2, Exception3 {

        if (x == 0) {
            throw new Exception1();
        } else if (x > 0) {
            throw new Exception2();
        } else if (x < 0) {
            throw new Exception3();
        }
    }

    public static void main(String[] args) {
        try {
            method(1);
            method(-1);
            method(0);
        } catch (Exception e) {
            m1(e);
            m2(e);
        }
    }

    static void m2(Exception e) {
        logger.severe("发生了异常，类型为：" + e.getClass().getSimpleName());
    }

}

class Exception1 extends Exception {

}

class Exception2 extends Exception {

}

class Exception3 extends Exception {

}