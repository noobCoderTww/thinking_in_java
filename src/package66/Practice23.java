package package66;

/**
 * @ClassName Practice23
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/28 14:29
 * @Version 1.0
 */
interface U {

    void m1();

    void m2();

    void m3();
}

class A {

    private static int i = 0;

    public U u() {
        return new U() {
            private int id;

            {
                id = i++;

            }

            @Override
            public void m1() {
                System.out.println(id + " 's m1() ");

            }

            @Override
            public void m2() {
                System.out.println(id + " 's m2() ");
            }

            @Override
            public void m3() {
                System.out.println(id + " 's m3() ");
            }

        };
    }
}

class B {
    private U[] us;

    private int count = 0;

    B(int size) {
        us = new U[size];
    }

    boolean addU(U u) {
        if (count < us.length) {
            us[count] = u;
            count++;
            return true;
        }
        return false;
    }

    void setUsElementToNull(int i) {
        us[i] = null;
    }


    void bsM() {

        for (var u : us) {
            if (u == null) {
                continue;
            }
            u.m1();
            u.m2();
            u.m3();
        }
    }

}


public class Practice23 {

    public static void main(String[] args) {
        var a = new A();
        var b = new B(10);
        var us = new U[10];
        for (var i = 0; i < us.length; i++) {
            us[i] = a.u();
            b.addU(us[i]);
        }


        b.bsM();
        b.setUsElementToNull(0);
        b.setUsElementToNull(0);
        System.out.println("----------------");
        b.bsM();
    }
}
