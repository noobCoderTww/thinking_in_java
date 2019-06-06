package package13;

import package12.Dog;

import java.util.Random;

/**
 * @ClassName XiaoKe
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/6 17:36
 * @Version 1.0
 */

public class XiaoKe extends Dog {


    private static Random random = new Random(47);

    private final int a;//空白final

    private  final int b = method(1);

    private final int c = 0;

    public  int method(int a) {
        System.out.println(1231321);
        return new XiaoKe().c;
    }


    public XiaoKe() {
        super("Xiaoke");
        a = 10;
    }

    public static void main(String[] args) {

    }
}


