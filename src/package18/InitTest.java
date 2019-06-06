package package18;

/**
 * @ClassName InitTest
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/7 17:34
 * @Version 1.0
 */

public class InitTest {

    public static int a = retrunA("初始化a");

    public int b = returnB("初始化b");

    public int c;

    static {
        System.out.println("父类静态代码块初始化");
    }

    {
        System.out.println("父类非静态代码块初始化");
    }

    public InitTest() {
        System.out.println("构造器初始化" + ",a:" + a + ",b:" + b + ",c:" + c);
        c = 3;
        System.out.println("c:" + c);

    }


    public static int retrunA(String s) {
        System.out.println(s);
        return 1;
    }

    public int returnB(String s) {
        System.out.println(s);
        return 2;
    }


}

class ExtendsClazz extends InitTest {

    public static int d = 4;

    public int e = 5;

    public int f;

    static {
        System.out.println("子类静态代码块初始化");
    }


    {
        System.out.println("子类代码块初始化");
    }

    public ExtendsClazz() {
        System.out.println("d:" + d + ",e:" + e + ",f:" + f);
        f = 6;
        System.out.println(f);
    }

    public static void main(String[] args) {
        System.out.println("开始");
        var a = new ExtendsClazz();
    }

}


enum Festival {
    SPRING,SUMMER,AUTUMN,WINTER,;

    public static void main(String[] args) {
        System.out.println(SUMMER);
    }
}