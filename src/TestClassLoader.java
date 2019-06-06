/**
 * @ClassName TestClassLoader
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/3/27 21:40
 * @Version 1.0
 */

public class TestClassLoader {

    public static void main(String[] args) {
                Son son = new Son();
                //Father so = new Son();
                // new Son(); 即使指定对象的类型为父类执行结果仍然一样，不指定对象的类型也一样
    }
}

class Marker {
    Marker(String i) {
        System.out.println("Maker(" + i + ")");
    }
}

class Father {
    static Marker marker1 = new Marker("father1");
    Marker marker2 = new Marker("father2");
}

class Son extends Father {
    static Marker marker1 = new Marker("son1");
    Marker marker2 = new Marker("son2");
}


class Util {
    static Marker marker1 = new Marker("util1");
    Marker marker2 = new Marker("util2");

    public static void util1() {

    }
}

class Main {
    static Marker marker1 = new Marker("not public1");

    Marker marker2 = new Marker("not public2");

    public static void main(String[] args) {
        System.out.println(Util.marker1);
        Son exmple = new Son();

    }
}


interface I {
}