package package53;


import java.util.Random;

public interface Cycle {

    void cycling();
}

class Uncycle implements Cycle {
    @Override
    public void cycling() {
        System.out.println("cycling uncycle");
    }
}

class Bicycle implements Cycle {
    @Override
    public void cycling() {
        System.out.println("cycling bicycle");
    }
}

class Tricycle implements Cycle {
    @Override
    public void cycling() {
        System.out.println("cycling tricycle");
    }
}

interface CycleFactory {

    Cycle getCycle();
}


class UncycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Uncycle();
    }
}

class BicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}

class People {

    public static void peopleUseCycle(CycleFactory factory) {
        var cycle = factory.getCycle();
        cycle.cycling();
    }

    public static void main(String[] args) {
        peopleUseCycle(new UncycleFactory());
        peopleUseCycle(new BicycleFactory());
        peopleUseCycle(new TricycleFactory());
    }
}

//使用工厂方法来创建一个框架，他可以执行抛硬币和掷骰子的方法
interface Gambling {
    //抛硬币
    void tossCoin();

    //掷骰子
    void dice();
}

class PeopleGambing implements Gambling {

    private static final Random random = new Random();

    @Override
    public void tossCoin() {
        var r1 = random.nextDouble();
        if (r1 > 0.5) {
            System.out.println("正面");
        } else {
            System.out.println("反面");
        }
    }


    @Override
    public void dice() {
        var r2 = random.nextInt(6) + 1;
        switch (r2) {
            case 1:
                System.out.println("小一");
                break;
            case 2:
                System.out.println("小二");
                break;
            case 3:
                System.out.println("小三");
                break;
            case 4:
                System.out.println("大四");
                break;
            case 5:
                System.out.println("大五");
                break;
            default:
                System.out.println("大六");
                break;
        }

    }

}

interface GamblingFactory {

    Gambling getGambling();
}

class PeopleGambingFactory implements GamblingFactory {

    @Override
    public Gambling getGambling() {
        return new PeopleGambing();
    }


}

class UseThis {

    static void useGambling(GamblingFactory gamblingFactory) {
        var gambling = gamblingFactory.getGambling();
        gambling.dice();
        gambling.tossCoin();
    }

    public static void main(String[] args) {
        useGambling(new PeopleGambingFactory());
    }
}
