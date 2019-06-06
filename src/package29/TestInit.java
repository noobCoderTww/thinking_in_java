package package29;

/**
 * @ClassName TestInit
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/16 21:16
 * @Version 1.0
 */

public class TestInit {
    public static void main(String[] args) {
        new ExExport(5);
    }
}

class Base {


    Base() {
        this.m();
    }

    void m() {
        System.out.println("Base m()");
    }
}

class Export extends Base {

    int num = 1;

    Export(int num) {
        this.num = num;
        m();
    }

    @Override
    void m() {
        System.out.println("Export m() " + num);
    }

}

class ExExport extends Export {

    int num = 2;


    ExExport(int i) {
        super(i);
        m();
    }

    @Override
    void m() {
        System.out.println("exexexex!!!!!" + num);
    }

}