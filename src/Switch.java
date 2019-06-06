import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName Switch
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/3/22 16:19
 * @Version 1.0
 */

public class Switch {

    public static void main(String[] args) {
        new Thread(() -> System.out.println(1231)).start();

    }
}

class Practice {
    public static void main(String[] args) {
        fibonacci(34);
    }

    public static int fibonacci(int param) {
        var i = 1;
        var j = 1;
        var k = 1;
        if (param == 1) {
            System.out.print(i + " " + j);
        }
        for (var m = 0; ; m++) {
            if (m == 0) {
                System.out.print(i + " " + j + " ");
            }
            k = i + j;
            System.out.print(k + " ");
            if (k == param) {
                break;
            }
            i = j;
            j = k;
        }
        return 0;
    }


}

class Dog {

    void bark(int height, String voice) {
        System.out.println("dog's height :" + height + "," + "dog's voice " + voice);
    }

    void bark(String voice, int height) {
        System.out.println("dog's height :" + height + "," + "dog's voice " + voice);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(10, "barking");
        dog.bark("barking", 10);
    }
}

class TestThis {
    Integer count = 0;
    String str;
    int num;

    TestThis() {
        System.out.println("   ====");
    }

    TestThis(String str) {
        this.str = str;
        System.out.println(str);
    }

    TestThis(int num) {
        this.num = num;
        System.out.println(num);
    }

    TestThis(String str, int num) {
        this.str = str;
        this.num = num;
    }

    void m1() {
        count++;
        System.out.println("m1 被调用了 " + count + "次");
    }

    void m2() {
        m1();
        this.m1();
    }

    public static void main(String[] args) {
        var t = new TestThis();
        t.m2();
    }
}

class TestFinalize {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize or not");
        super.finalize();
    }

    public static void main(String[] args) {
        var tf = new TestFinalize();

        System.gc();
    }
}

class Tank {
    String status;
    Tank(String status) {

    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("已回收");
    }
}