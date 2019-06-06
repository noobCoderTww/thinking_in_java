package package41;

import java.util.Arrays;

public interface Processor1 {

    String name();

    Object process(Object input);

}

class Apply {
    public static void process(Processor1 p, Object s) {
        System.out.println("Using processor1 " + p.name());
        p.process(s);
    }
}

abstract class StringProcessor implements Processor1 {
    public static String s = "if she weighs the same as duck , she's made of food";

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract Object process(Object input);

    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
    }

}

class Upcase extends StringProcessor {
    @Override
    public Object process(Object input) {

        return ((String) input).toUpperCase();
    }
}

class Downcase extends StringProcessor {
    @Override
    public Object process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends StringProcessor {
    @Override
    public Object process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}


interface I1 {
    void method();
}

interface I2 {
    void method();
}

class Imple implements I1, I2 {
    @Override
    public void method() {

    }
}