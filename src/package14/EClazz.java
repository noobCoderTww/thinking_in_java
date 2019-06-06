package package14;

import java.util.Random;

/**
 * @ClassName EClazz
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/7 15:55
 * @Version 1.0
 */

public class EClazz {


    public static void main(String[] args) {
        var timeStart = System.currentTimeMillis();
        System.out.println("直接调用开始");
        var b = 0;
        for (var i = 0; i < 1000000000; i++) {
            for (var j = 0; j < 10000000; j++) {
                b++;
            }
            b -= 10000000;
        }
        var timeEnd = System.currentTimeMillis();
        System.out.println("直接调用结束" + (timeEnd - timeStart));
      /*  var random = new Random(47);

        for (var j = 0; j < 1000; j++) {
            var i = random.nextInt(200);
            System.out.println(i);
        }*/
    }


}
