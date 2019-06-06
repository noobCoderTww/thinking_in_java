package package63;

/**
 * @ClassName Wrapping
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/25 16:39
 * @Version 1.0
 */

public class Wrapping {
    private int i;

    public Wrapping(int x) {
        i = x;
    }

    public int value() {
        return i;
    }

}

class Parcel8 {
    public Wrapping wrapping() {
        return new Wrapping(10) {
            private int i;

            @Override
            public int value() {

                return super.value() + 1;
            }
        };
    }
}

interface Destination {
    String readLabel();
}

class Parcel9 {


    private String c = "硅谷";

    public Destination destination = new Destination() { //注意匿名内部类同样可以定义在成员变量中
        String a = c;//如果使用的是外部类的成员变量 ，那么就不需要该成员变量是final的

        @Override
        public String readLabel() {
            a = "1000";
            return null;
        }
    };


    public Destination destination(final String desc) { // 即使你不指定final 它也是final的，注意final只能修饰变量 即在左边 ，如果等式右边的值为final也不能说明被赋值的变量是final的
        return new Destination() {
            String label = desc;

            @Override
            public String readLabel() {
                // desc = "12";  不能
                return label;
            }
        };
    }

    public static void main(String[] args) {
        var p = new Parcel9();
        var d = p.destination("硅谷");
        var label = d.readLabel();
        System.out.println(label);

        var s = "123";
        class Io {
            String a = s; //只要不是匿名内部类就不必指定final

            public Io() {
                a = "100";
            }
        }
    }
}


abstract class Base {
    public Base(int i) {
        System.out.println("Base.Constructor.i = " + i + 1);
    }

    abstract void f();
}

class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            //匿名内部类不能有构造方法 但是在实例化匿名内部类仍然会执行父类的构造方法（接口无构造方法）
            {
                System.out.println("这算代码块吗？"); //匿名内部类的代码块仍然会被执行
            }

            {
                System.out.println(12313);
            }

            @Override
            void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        var b1 = getBase(47);
        b1.f();
    }
}

class Parcel10 {
    /*var i = new int[10];
                var j = new int[]{
                        10,
                };
                int[] k = {
                        10, 11, 12
                };*/   //数组的三种定义方式
    public Destination destination(final String desc, final float price) {
        return new Destination() {

            private int cost;

            private String label = desc;

            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("over budget!");
                }
            }

            @Override
            public String readLabel() {
                System.out.println(label);
                return label;
            }
        };
    }

    public static void main(String[] args) {
        var p = new Parcel10();
        var d = p.destination("硅谷", 110.10f);
        d.readLabel();
    }
}


interface InnerInt {

    void m1();
}

class Practice7 {
    private int age;

    private String getName() {
        return getClass().getSimpleName();
    }

    public InnerInt innerInt() {
        return new InnerInt() {

            private int i;

            @Override
            public void m1() {
                System.out.println(age);
                System.out.println(getName());
            }
        };
    }

    public static void main(String[] args) {
        var p = new Practice7();
        p.age = 10;
        var i1 = p.innerInt();
        i1.m1();
    }
}


