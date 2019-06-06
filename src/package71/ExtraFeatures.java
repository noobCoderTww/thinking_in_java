package package71;

/**
 * @ClassName ExtraFeatures
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/20 11:13
 * @Version 1.0
 */


class MyException2 extends Exception {
    private int x;

    public MyException2() {

    }

    public MyException2(String msg) {
        super(msg);
    }

    public MyException2(String msg, int x) {
        super(msg);
        this.x = x;
    }

    public int val() {
        return x;
    }

    @Override
    public String getMessage() {
        return "Detail msg " + x + super.getMessage();
    }
}

public class ExtraFeatures {
    public static void f() throws MyException2 {
        throw new MyException2();
    }


    public static void g() throws MyException2 {
        throw new MyException2("我要抛出异常");
    }


    public static void h() throws MyException2 {
        throw new MyException2("抛异常", 10);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 e) {
            e.printStackTrace();
        }
        try {
            g();
        } catch (MyException2 e) {
            e.printStackTrace();
        }
        try {
            h();
        } catch (MyException2 e) {
            e.printStackTrace();
            System.out.println(e.val());
        }
    }
}
