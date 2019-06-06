package package69;

import java.util.TreeMap;

/**
 * @ClassName Pet
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/6 20:10
 * @Version 1.0
 */

public interface Pet {

}

class Dog implements Pet {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Cat implements Pet {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Hamster implements Pet {
    private String name;

    public Hamster(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class TestMap {


    private static class Inner {
        public static void main(String[] args) {
            var map = new TreeMap<String, Pet>();
            var h = new Hamster("What ?");
            map.put("My dog", new Dog("Fat Dog"));
            map.put("My cat", new Cat("Thin cat"));
            map.put("My hamster", h);
            System.out.println(map.containsKey("My dog"));
            System.out.println(map.containsValue(new Dog("Fat Dog")));
            System.out.println(map.containsValue(h));
        }
    }

}