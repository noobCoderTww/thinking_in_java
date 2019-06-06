package package64;

import java.util.Random;

/**
 * @ClassName HorrorShow
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/26 11:28
 * @Version 1.0
 */
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Letal {
    void kill();
}

class DragonZilla implements DangerousMonster {
    @Override
    public void destroy() {

    }

    @Override
    public void menace() {

    }
}

interface Vampire extends DangerousMonster, Letal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {


    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}

public class HorrorShow {

    DangerousMonster dangerousMonsterImp = new DangerousMonster() {
        @Override
        public void destroy() {

        }

        @Override
        public void menace() {

        }
    };

    public Vampire vampire() {
        return new Vampire() {
            @Override
            public void drinkBlood() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void menace() {

            }
        };
    }


    static void u(Monster b) {
        b.menace();
    }

    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }

    static void w(Letal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}

//练习15
class First {

    private int i;

    First(int i) {
        this.i = i;
        System.out.println(i);
    }


    public void method() {
        System.out.println("BOOM BOOM BOOM");
    }
}

class Two {

    public static First first() {
        return new First(10) {

        };
    }


    public static void main(String[] args) {
        var f = Two.first();
        f.method();
    }
}


interface Service {
    void method1();

    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Imp1 implements Service {

    private Imp1() {

    }

    @Override
    public void method1() {
        System.out.println("Imp1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Imp1 method2");
    }

    public static ServiceFactory serviceFactory = new ServiceFactory() {

        private int i;

        @Override
        public Service getService() {
            return new Imp1();
        }

    };
}

class Imp2 implements Service {


    private Imp2() {

    }

    @Override
    public void method1() {
        System.out.println("Imp2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Imp2 method2");
    }

    public static ServiceFactory serviceFactory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Imp2();
        }
    };

}


class Factories {

    public static void consumer(Service service) {
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        consumer(Imp1.serviceFactory.getService());

        consumer(Imp2.serviceFactory.getService());
    }
}


interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {

    private int moves = 0;

    private static final int MOVES = 4;

    private Checkers() {

    }

    @Override
    public boolean move() {

        System.out.println("Checkers() " + moves);
        return moves++ != MOVES;
    }

    public static GameFactory gameFactory = new GameFactory() {
        private int i = 0;

        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game {

    private int moves = 0;

    private static final int MOVES = 10;

    private Chess() {

    }

    @Override
    public boolean move() {
        System.out.println("Chess() " + moves);

        return moves++ != MOVES;
    }

    public static GameFactory gameFactory = new GameFactory() {

        private int i = 0;

        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}

class Play {

    public static void playGame(Game game) {

        while (game.move()) {

        }
    }

    public static void main(String[] args) {
        playGame(Checkers.gameFactory.getGame());
        playGame(Chess.gameFactory.getGame());
    }
}

@FunctionalInterface
interface Cycle {
    void cycling();
}

@FunctionalInterface
interface CycleFactory {
    Cycle getCycle();
}

class Uncycle implements Cycle {

    @Override
    public void cycling() {
        System.out.println("I'm cycling " + getClass().getSimpleName());
    }

    private Uncycle() {

    }

    public static CycleFactory cycleFactory = new CycleFactory() {

        private int i = 0;

        @Override
        public Cycle getCycle() {
            return new Uncycle();
        }
    };
}

class Bicycle implements Cycle {

    private Bicycle() {

    }

    @Override
    public void cycling() {
        System.out.println("I'm cycling " + getClass().getSimpleName());
    }

    public static CycleFactory cycleFactory = () -> new Bicycle();

}

class Tricycle implements Cycle {

    private Tricycle() {

    }


    @Override
    public void cycling() {
        System.out.println("I'm cycling " + getClass().getSimpleName());
    }

    public static CycleFactory cycleFactory = () -> new Tricycle();


}

class UseCycle {

    public static void ride(Cycle cycle) {
        cycle.cycling();
    }

    public static void main(String[] args) {
        ride(Uncycle.cycleFactory.getCycle());
        ride(Bicycle.cycleFactory.getCycle());
        ride(Tricycle.cycleFactory.getCycle());
    }
}

//使用工厂方法创建框架，它可以执行抛骰子和掷硬币方法 Throw dice toss a coin

@FunctionalInterface
interface Dice {
    void throwDice();
}

@FunctionalInterface
interface Coin {
    void tossCoin();
}

@FunctionalInterface
interface DiceFactory {
    Dice getDice();
}

@FunctionalInterface
interface CoinFactory {
    Coin getCoin();
}

class ChineseCoin implements Coin {
    private static final Random random = new Random(47);

    private ChineseCoin() {

    }

    @Override
    public void tossCoin() {
        switch (random.nextInt(2)) {
            case 0:
                System.out.println("正面");
                break;
            case 1:
                System.out.println("反面");
                break;
        }
    }

    public static CoinFactory coinFactory = () -> new ChineseCoin();
}

class SixDice implements Dice {

    private static final Random random = new Random(47);


    private byte[] bytes = {
            0, 1, 2, 3, 4, 5
    };

    private String[] strs = {
            "一", "二", "三", "四", "五", "六"
    };

    public static DiceFactory diceFactory = () -> new SixDice();

    private SixDice() {

    }

    @Override
    public void throwDice() {
        var b1 = random.nextInt(6);
        for (var i = 0; i < bytes.length; i++) {
            if (bytes[i] == b1) {
                System.out.println(strs[i]);
            }
        }

    }
}

class PlayGame {
    public static void playCoin(Coin coin) {
        coin.tossCoin();
    }

    public static void playDice(Dice dice) {
        dice.throwDice();
    }

    public static void main(String[] args) {
        playCoin(ChineseCoin.coinFactory.getCoin());
        playDice(SixDice.diceFactory.getDice());
    }
}