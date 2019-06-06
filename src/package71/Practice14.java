package package71;

/**
 * @ClassName Practice14
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/21 15:57
 * @Version 1.0
 */

public class Practice14 {


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
        }
        System.out.println(456);
        System.out.println(789);



    }
}
