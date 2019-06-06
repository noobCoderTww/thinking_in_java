package package9;

import package10.AnTestExtends;

/**
 * @ClassName ToTestExtends
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/3 11:53
 * @Version 1.0
 */

public class ToTestExtends extends AnTestExtends {
    public static void main(String[] args) {
        var t1 = new ToTestExtends();
        t1.protectedMethod();
        t1.publicMethod();
    }
}
