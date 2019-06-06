package package71;

/**
 * @ClassName Practice3
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/15 10:48
 * @Version 1.0
 */

public class Practice3 {


    public static void main(String[] args) {
        String[] arr = {
                "abc",
                "cef",
                "fgh"
        };
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("数组下标越界");
        }
    }
}
