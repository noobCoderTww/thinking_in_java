package package11;

/**
 * @ClassName Base
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/3 22:12
 * @Version 1.0
 */

public class Base {

    public static void m1() {
        System.out.println("static method()");
    }

    public void m2() {
        System.out.println("regular method");
    }
}

class Export extends Base {

    public Export() {
        super.m2();
    }

    public static void main(String[] args) {
        new Export();
    }

    @Override
    public void m2() {
        System.out.println("override method");
    }
}


class GrandFather {
    //父类test方法
    void test() {
        System.out.println("Grandfather");
    }
}


class Father extends GrandFather {
    //父类test方法
    void test() {
        System.out.println("father");
    }

    //父类构造方法
    Father() {
        System.out.println("before test()");
        super.test();
        System.out.println("after test()");
    }

}

class Son extends Father {
    private int temp = 1;

    //子类test()方法
    void test() {
        System.out.println("son = " + temp);
    }

    //子类构造方法
    Son(int temp) {
        this.temp = temp;
        test();
    }

    public static void main(String[] args) {
        new Son(5);
    }
}

class BaseClazz {
    public BaseClazz() {
        System.out.println("基类");
    }
}


class ExportClazz extends BaseClazz {
    public ExportClazz() {
        System.out.println("导出类");
    }

    public static void main(String[] args) {
        new ExportClazz();
    }
}


class A {


    public A(int a) {
        System.out.println("A");
    }

}


class B {
    public B(int b) {
        System.out.println("B");
    }
}


class C extends A {
    private B b;


    public C(int a, int b) {
        super(a);
        this.b = new B(b);
    }

    public static void main(String[] args) {
        new C(1, 2);
    }

}


class Aa {
    public Aa(int i) {
        System.out.println(i);
    }
}


class Bb extends Aa {

    public Bb() {
        super(1);
    }

    public Bb(int i) {
        super(i);
    }

    public static void main(String[] args) {
        new Bb();
        new Bb(2);
    }
}

class Root {
    private Component1 component1 = new Component1();

    private Component2 component2 = new Component2();

    private Component3 component3 = new Component3();


    public Root() {
        System.out.println("Root()");
    }
}


class Component1 {
    public Component1() {
        System.out.println("Component1()");
    }
}

class Component2 {
    public Component2() {
        System.out.println("Component2()");
    }
}

class Component3 {
    public Component3() {
        System.out.println("Component3()");
    }
}

class Stem extends Root {

    private Component1 component1 = new Component1();

    private Component2 component2 = new Component2();

    private Component3 component3 = new Component3();


    public Stem() {
        System.out.println("Stem()");

    }

    public static void main(String[] args) {
        new Stem();
    }
}


class Cleanser {
    private String s = "Cleanser";


    public String append(String a) {
        return s += a;
    }

    public void dilute() {
        append("delute ()");
    }


    public void apply() {
        append("apply()");
    }


    public void Scrub() {
        append("scrub()");

    }

    public String toString() {
        return s;

    }


    public static void main(String[] args) {
        var x = new Cleanser();
        x.dilute();
        x.apply();
        x.Scrub();
        System.out.println(x);
    }

}

class Detergent {
    private Cleanser x = new Cleanser();

    public String append(String a) {
        return x.append(a);
    }

    public void dilute() {
        x.dilute();
    }

    public void apply() {
        x.apply();
    }

    public void Scrub() {
        x.Scrub();
    }

    @Override
    public String toString() {
        return x.toString();
    }

    public static void main(String[] args) {
        Cleanser.main(args);
    }
}


class Dog {
    public void eat(int i) {
        System.out.println(i + " Kg");
    }

    public String eat(String foodName) {
        return "dog eat " + foodName;
    }
}


class Maomao extends Dog {


    private static Maomao maomao = new Maomao();

    public String eat(Meat meat) {
        return "Maomao eat" + meat.kg + "kg meat";
    }

    private Maomao() {

    }

    public static Maomao getInstance() {
        return maomao;
    }

}

class Meat {

    int kg;

    Meat(int kg) {
        this.kg = kg;
    }

}