package package69;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName FileInputStreamUtil
 * @Description file工具类
 * @Author tanwenwei
 * @Date 2019/5/7 9:53
 * @Version 1.0
 */

public class FileInputStreamUtil {

    private FileInputStreamUtil() {

    }

    public static String readFile(String path) throws IOException {
        var file = new File(path);
        var bis = new BufferedInputStream(new FileInputStream(file));
        var buf = new byte[1024];
        var len = 0;
        var sb = new StringBuilder();
        while ((len = bis.read(buf)) != -1) {
            sb.append(new String(buf, 0, len));
        }
        bis.close();
        return sb.toString();
    }
}
