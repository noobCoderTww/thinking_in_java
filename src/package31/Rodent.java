package package31;

/**
 * @ClassName Rodent
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/18 16:30
 * @Version 1.0
 */

public abstract class Rodent {


    abstract void eat();

    abstract void run();

    abstract void diggingHole();
}

class Mouse extends Rodent {

    @Override
    void eat() {
        System.out.println("mouse eat");
    }


    @Override
    void run() {
        System.out.println("mouse run");
    }

    @Override
    void diggingHole() {
        System.out.println("mouse can digging hole ");
    }

}


