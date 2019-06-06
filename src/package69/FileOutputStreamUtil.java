package package69;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileOutputStreamUtil
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/8 9:41
 * @Version 1.0
 */

public class FileOutputStreamUtil {

    public static void writeFile(String path, String str) throws IOException {
        var bis = new BufferedOutputStream(new FileOutputStream(new File(path)));
        for (var i : str.getBytes()) {
            bis.write(i);
        }
        bis.close();
    }

    public static void main(String[] args) {
        try {
            writeFile("D:\\test\\package11\\practice1.txt", "this is a java test");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
