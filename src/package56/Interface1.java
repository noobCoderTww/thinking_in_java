package package56;

/**
 * @ClassName Interface1
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/23 22:27
 * @Version 1.0
 */

public interface Interface1 {

    Imp1 I = new Imp1();

    void m1();
}

class Imp1 implements Interface1 {
    @Override
    public void m1() {
        System.out.println("m1()");
    }
}

