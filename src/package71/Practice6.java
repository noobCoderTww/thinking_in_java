package package71;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @ClassName Practice6
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/20 11:28
 * @Version 1.0
 */

public class Practice6 extends Exception {

    private static Logger logger = Logger.getLogger("Practice6");

    public Practice6() {
        var sw = new StringWriter();
        this.printStackTrace(new PrintWriter(sw));
        logger.severe(sw.toString());
    }

    public static void main(String[] args) {
        try {
            throw new Practice6();
        } catch (Practice6 p6) {

        }
    }
}
