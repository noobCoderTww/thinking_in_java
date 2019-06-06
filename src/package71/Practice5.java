package package71;

/**
 * @ClassName Practice5
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/15 11:09
 * @Version 1.0
 */

public class Practice5 {
    public static void main(String[] args) {
        String[] str = {
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7"
        };

        var i = 10;
        while (i > 5) {
            try {
                System.out.println(str[i]);
                System.out.println("我是正常执行步骤");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("发生了异常");
            } finally {
                i--;
            }
        }
    }
}
