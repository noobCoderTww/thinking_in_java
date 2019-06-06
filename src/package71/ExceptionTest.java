package package71;

/**
 * @ClassName ExceptionTest
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/13 17:39
 * @Version 1.0
 */

public class ExceptionTest {

    public static void main(String[] args) {
   /*     System.out.println(new ExceptionTest());
        System.out.println(new Object());*/

        try {
            throw new Exception("msg");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace(System.out);
        }finally {
            System.err.println("123");
        }
    }
}
