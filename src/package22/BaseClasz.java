package package22;

import package23.ExportClazs;

/**
 * @ClassName BaseClasz
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/9 15:32
 * @Version 1.0
 */

public class BaseClasz {
     void m1() {
        System.out.println("BaseClasz");
    }

    public static void main(String[] args) {
        BaseClasz exportClazs = new ExportClazs();
        exportClazs.m1();
    }

}

class Test {
    public static void main(String[] args) {
        BaseClasz exportClazs = new ExportClazs();
        exportClazs.m1();
    }
}