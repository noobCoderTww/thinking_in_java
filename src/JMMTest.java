/**
 * @ClassName JMMTest
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/3/22 22:10
 * @Version 1.0
 */

public class JMMTest {
    /*volatile*/ boolean flag = true;

    void m() {
        System.out.println("begin");
        while (flag) {

        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        var jm = new JMMTest();
        new Thread(jm::m, "t1").start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        jm.flag = false;
    }
}
