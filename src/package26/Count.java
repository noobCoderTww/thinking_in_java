package package26;

/**
 * @ClassName Count
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/14 8:54
 * @Version 1.0
 */

public class Count {
}

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("creating " + this);
    }


    public void addRef() {
        refcount++;
    }

    protected void dispose() {

        if (--refcount == 0) {
            System.out.println("despose()" + this);
        }
    }

    public String toString() {
        return "Shared " + id;
    }
}


class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;


    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }


    public String toString() {
        return "Composing " + id;
    }

    public static void main(String[] args) {
        var shared = new Shared();
        Composing[] coposings = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
        };
        for (var composing : coposings) {
            composing.dispose();
        }
    }
}