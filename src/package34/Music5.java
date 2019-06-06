package package34;

/**
 * @ClassName Music5
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/18 21:33
 * @Version 1.0
 */

public class Music5 {

    public static void main(String[] args) {

    }
}

interface Instrument {


    void adjust();
}

interface Playable {
    void play();
}

abstract class Wind implements Instrument, Playable {
    @Override
    public void play() {

    }

    @Override
    public String toString() {

        return "";
    }

    @Override
    public void adjust() {

    }
}

abstract class Percussion implements Instrument, Playable {

    @Override
    public void play() {

    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void adjust() {

    }
}

abstract class Stringed implements Instrument, Playable {


    @Override
    public void play() {

    }

    @Override
    public String toString() {
        return "";
    }

    @Override
    public void adjust() {

    }
}

class Woodwind extends Wind {

}

class Brass extends Wind {


    static void tuneAll() {

    }
}


