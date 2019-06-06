package package27;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName Rodent
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/15 21:44
 * @Version 1.0
 */

public abstract class Rodent {

    Emotion emotion = new Emotion("Rodent");


    public Rodent() {
        System.out.println("Rodent()");
    }

    abstract void eat();
}

class Mouse extends Rodent {
    Emotion emotion = new Emotion("Mouse");

    public Mouse() {
        System.out.println("Mouse()");
    }

    @Override
    void eat() {
        System.out.println("eat something Mouse like");
    }
}

class Gerbil extends Rodent {

    Emotion emotion = new Emotion("Gerbil");

    public Gerbil() {
        System.out.println("Gerbil()");
    }

    @Override
    void eat() {
        System.out.println("eat something Gerbil like");
    }
}

class Hamster extends Rodent {

    Emotion emotion = new Emotion("Hamster");

    public Hamster() {
        System.out.println("Hamster()");
    }

    @Override
    void eat() {
        System.out.println("eat something Hamster like ");
    }
}

class TestRodent {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        var arrayList = new ArrayList<>(Arrays.asList(rodents));
        var it = arrayList.iterator();
        while (it.hasNext()) {
            var rodent = it.next();
            rodent.eat();
        }
    }
}

class Emotion {
    Emotion(String str) {
        System.out.println(str + " scared cat");
    }
}

interface Test {

}

abstract class AbClazz {


    abstract void print();

    AbClazz() {

        print();
    }
}

class Two extends AbClazz {


    int a = 1;

    Two() {

    }

    @Override
    void print() {
        System.out.println(a);
    }


    public static void main(String[] args) {
        new Two().print();
    }
}