package package66;

/**
 * @ClassName Outer
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/29 10:09
 * @Version 1.0
 */


interface Closure {
    void m1();
}

public class Outer {

    public Closure getClosure(int i) {
        System.out.println(i + 1);
        var k = 0;  // k是局部变量 但是即使getClosure方法结束了 匿名内部类中的k仍然可以使用
        return new Closure() {
            private int j = i + 1;

            @Override
            public void m1() {
                System.out.println(i);
                System.out.println(k);
            }
        };
    }

    public static void main(String[] args) {

    }
}
