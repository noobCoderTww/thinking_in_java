package package19;

/**
 * @ClassName Cycle
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/8 11:17
 * @Version 1.0
 */

public class Cycle {

    void ride() {
        System.out.println("ride on cycle" + wheels(0));

    }

    int wheels(int i) {
        return i;
    }
}


class Unicycle extends Cycle {

    @Override
    void ride() {
        System.out.println("ride on Unicycle" + wheels(1));
    }

    public void balance() {
        System.out.println("Unicycle balance not good");
    }
}


class Bicycle extends Cycle {

    @Override
    void ride() {
        System.out.println("ride on Bicycle" + wheels(2));
    }

    public void balance() {
        System.out.println("Bicycle balance better");
    }
}

class Tricycle extends Cycle {
    @Override
    void ride() {
        System.out.println("ride on Tricycle" + wheels(3));
    }

}

class OfficeWorker {

    void useCycle(Cycle cycle) {
        cycle.ride();
    }

    public static void main(String[] args) {
        var of = new OfficeWorker();
        of.useCycle(new Cycle());
        of.useCycle(new Unicycle());
        of.useCycle(new Bicycle());
        of.useCycle(new Tricycle());

    }
}



