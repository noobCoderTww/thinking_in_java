package package71;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @ClassName LoggingException2
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/20 10:57
 * @Version 1.0
 */

public class LoggingException2 {
    private static Logger logger = Logger.getLogger("LoggingException2");

    static void loggingException(Exception e) {
        var sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        logger.severe(sw.toString());
    }

    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (Exception e) {
            loggingException(e);
        }
    }

}
