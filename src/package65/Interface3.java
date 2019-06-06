package package65;

public interface Interface3 {

    static void m1() {
        System.out.println(123);
    }
}

class Imp implements Interface3 {
    public static void main(String[] args) {
        var i = new Imp();

    }
}

class Base {

    static void method() {
        System.out.println(123);
    }
}

class Export extends Base {


    public static void main(String[] args) {
        Export.method();
    }
}
