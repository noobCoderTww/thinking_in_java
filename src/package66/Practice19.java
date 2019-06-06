package package66;

/**
 * @ClassName Practice19
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/28 9:35
 * @Version 1.0
 */

public class Practice19 {
    static class In {
        static class InIn {
            static class InInIn {
                void m1() {
                    System.out.println(123);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Practice19.In.InIn.InInIn().m1();
    }
}
