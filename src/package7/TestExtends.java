package package7;

/**
 * @ClassName TestExtends
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/3 11:40
 * @Version 1.0
 */

public class TestExtends extends Fa {
    public static void main(String[] args) {
        var t1 = new TestExtends();
        t1.pbM();
        t1.proM();
        t1.defM();
    }

    public void m1() {

    }
}

class Fa {

    public void pbM() {

    }

    protected void proM() {

    }

    void defM() {

    }

    private void priM() {

    }

}

class Test {
    public static void main(String[] args) {
        var t1 = new TestExtends();
        t1.pbM();
        t1.proM();
        t1.defM();
    }
}