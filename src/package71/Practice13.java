package package71;

/**
 * @ClassName Practice13
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/21 15:49
 * @Version 1.0
 */
class Mye extends Exception {
}

public class Practice13 {

    static void f() throws Mye {
        throw new Mye();
    }

    public static void main(String[] args) {

        try {
            f();
        } catch (Mye e) {

        } finally {
            System.out.println(123);
        }
        System.out.println(123);

    }
}
