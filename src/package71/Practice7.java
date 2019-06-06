package package71;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @ClassName Practice7
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/20 11:34
 * @Version 1.0
 */

public class Practice7 {
    private static Logger logger = Logger.getLogger("Practice7");

    static void loggingException1(Exception e) {
        var sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        logger.severe(sw.toString());
    }

    static void loggingException2(Exception e) {
        var sw = new StringWriter();
        logger.severe("发生了异常，类型为:" + e.getClass().getSimpleName());
    }


    public static void main(String[] args) {
        try {
            String[] arr = {
                    "", "", "", ""
            };
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            loggingException1(e);
            loggingException2(e);
        }
    }

}

class MrException extends RuntimeException {
    MrException(String str) {
        super(str);
    }
}

class Ten {
    public static void main(String[] args) {

        try {
            m1();
        } catch (MrException e) {
            System.out.println(e.getLocalizedMessage());
        }


    }

    static void m1() {
        throw new MrException("dasdasda");
    }
}