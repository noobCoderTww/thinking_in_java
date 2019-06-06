package package54;

/**
 * @ClassName Parcell
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/23 11:26
 * @Version 1.0
 */

public class Parcell {
    class Contents {
        private int i = 12;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }


    public void ship(String dest) {
        var c = new Contents();
        var d = new Destination(dest);

        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        var p = new Parcell();
        p.ship("Tasmania");
    }
}

class Parcel2 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            this.label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {

        var c = contents();

        var d = to(dest);

        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        var p = new Parcel2();
        p.ship("Tasmania");
        var q = new Parcel2();

        var contents = q.contents();
        var borneo = q.to("Borneo");
    }

    public void m() {
        var parcel2 = new Parcel2();
        var d = parcel2.new Destination("dsad");
    }
}

class Outer {
    class Inner {

    }


    Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        var outer = new Outer();
        var inner = outer.getInner();
        var inner1 = outer.new Inner();
    }
}















