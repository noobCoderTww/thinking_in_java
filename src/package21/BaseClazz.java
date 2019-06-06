package package21;

/**
 * @ClassName BaseClazz
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/9 15:17
 * @Version 1.0
 */

public class BaseClazz {

    private int m = 5;

    public void m1() {
        var i = m2();
        System.out.println(i);
    }


    public int m2() {
        return 1;
    }

    public void m3(){
        System.out.println(m);
    }
}

class ExportClazz extends BaseClazz {
    private int m = 6;
    @Override
    public int m2() {
        return 2;
    }

    public static void main(String[] args) {
        new ExportClazz().m3();
    }
}