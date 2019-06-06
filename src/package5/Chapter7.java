package package5;

/**
 * @ClassName Chapter7
 * @Description 父类
 * @Author tanwenwei
 * @Date 2019/4/3 10:55
 * @Version 1.0
 */

public class Chapter7 {

    public String s1 = "s1";
    protected String s2 = "s2";
    String s3 = "s3";
    private String s4 = "s4";
    public static String str = "测试1";


    public String toString() {
        return "s1:" + s1 + "\r\n" + "s2:" + s2 + "\r\n" + "s3:" + s3 + "\r\n" + "s4:" + s4;
    }

}

class Fa {
    private String s1 = "s1";
    String s2 = "s2";
    protected String s3 = "s3";
    public String s4 = "s4";
}

class Son extends Fa {
    public static void main(String[] args) {

    }
}
