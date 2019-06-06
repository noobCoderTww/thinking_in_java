package package61;

import package59.PracticeInterface;
import package60.PracticeClazz;

/**
 * @ClassName ThirdClazz
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/24 15:55
 * @Version 1.0
 */

public class ThirdClazz extends PracticeClazz {


    public class InnerClazz extends ImpPracticeInterface {

        @Override
        public void m3() {

        }

    }

    public PracticeInterface getImpPracticeInterface() {

        var I1 = new InnerClazz();
        I1.m2();
        I1.m3();

        var p1 = new PracticeClazz();
        var ip1 = p1.new ImpPracticeInterface();

        return new InnerClazz();
    }

    private class OkEx extends Ok {

    }
}

class Outer {
    private String name;

    private String getName() {
        return name;
    }

    class Inner {

    }

    public static void main(String[] args) {

    }
}












