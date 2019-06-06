package package71;

/**
 * @ClassName Practice2
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/15 10:45
 * @Version 1.0
 */

public class Practice2 {

    void m1() {

    }

    public static void main(String[] args) {
        Practice2 p = null;

        try {
            p.m1();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
