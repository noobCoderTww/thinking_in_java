package package65;

/**
 * @ClassName LambdaTest
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/26 16:31
 * @Version 1.0
 */

public class LambdaTest {


    public static void main(String[] args) {

        MathOperation m1 = (a, b) -> a + b;

        MathOperation m2 = (int a, int b) -> a - b;

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}


