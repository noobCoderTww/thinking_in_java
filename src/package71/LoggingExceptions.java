package package71;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @ClassName LoggingExceptions
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/15 14:17
 * @Version 1.0
 */


class LoggingException extends Exception {

    private Logger logger = Logger.getLogger("LoggingException");

    public LoggingException() {
        var trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe("dasdasd");
    }
}

public class LoggingExceptions {
    public static void main(String[] args)  {



        try {
            throw new LoggingException();
        } catch (LoggingException e) {
            System.err.println(e);
        }


    }
}
