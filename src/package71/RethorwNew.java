package package71;

/**
 * @ClassName RethorwNew
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/21 10:22
 * @Version 1.0
 */

class MyException_1 extends Exception {

}

class MyException_2 extends Exception {

}

public class RethorwNew {

    static void f() throws MyException_1 {
        throw new MyException_1();
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (MyException_1 e) {
                e.printStackTrace();
                throw new MyException_2();
            }
        } catch (MyException_2 e) {
            e.printStackTrace();
        }
    }
}
