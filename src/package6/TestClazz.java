package package6;

import package5.Chapter7;

/**
 * @ClassName TestClazz
 * @Description 子类
 * @Author tanwenwei
 * @Date 2019/4/3 10:58
 * @Version 1.0
 */

public class TestClazz extends Chapter7 {
    public String s1 = "1";
    protected String s2 = "2";
    String s3 = "3";
    private String s4 = "4";
    public static int str = 1;

    public static void main(String[] args) {
        var t1 = new TestClazz();
        System.out.println(t1);
        System.out.println(t1.s1);
        System.out.println(str);
    }

    @Override
    public String toString() {
        System.out.println();
        System.out.println(super.toString());
        return "s1:" + s1 + "\r\n" + "s2:" + s2 + "\r\n" + "s3:" + s3 + "\r\n" + "s4:" + s4;
    }

}


class TestFiled {
    String filed = "123";

    public String getFiled() {
        return filed;
    }

    public static void main(String[] args) {
        var d1 = new Son();
        var d2 = new Son();
        System.out.println(d1.filed);
        System.out.println();
    }
}

class Son extends TestFiled {
    String filed = "456";

    public String getFiled() {
        return filed;
    }


}


