package package15;

import package16.ExportClazzz;

/**
 * @ClassName BaseClazzz
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/7 13:22
 * @Version 1.0
 */

public class BaseClazzz {

    void m1() {
        System.out.println("m()");
    }
}

class Test {


    void m2(BaseClazzz baseClazzz) {
        baseClazzz.m1();
    }

    public static void main(String[] args) {
        new Test().m2(new ExportClazzz());
    }
}
