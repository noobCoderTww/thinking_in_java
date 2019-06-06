package package71;

/**
 * @ClassName Practice4
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/15 10:52
 * @Version 1.0
 */


class T1 {
    private String msg;

    T1() {
    }

    T1(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}

class T2 extends T1 {


    T2(String msg) {
        super(msg);
    }

    public String getMsg() {
        return super.getMsg();
    }
}

class MyException extends Exception {

    private String msg;

    MyException(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
}

public class Practice4 {
    public static void main(String[] args) {
        try {
            throw new MyException("hape");
        } catch (MyException e) {
            System.out.println(e.getMsg());
        }
    }
}
