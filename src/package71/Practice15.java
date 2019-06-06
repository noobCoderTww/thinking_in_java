package package71;

/**
 * @ClassName Practice15
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/21 16:02
 * @Version 1.0
 */

public class Practice15 {

    static void f() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            System.out.println(123);
            f();
            System.out.println(456);
        } catch (NullPointerException e) {
            System.out.println(456);
        } finally {
            System.out.println(456);
        }
        System.out.println(789);

        final int b = 10;


        new Thread(() -> System.out.println(123));
    }
}
