package package35;

/**
 * @ClassName Strategy
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/19 10:10
 * @Version 1.0
 */

public interface Strategy {

    void strategySMethod();
}

class Strategy1 implements Strategy {

    @Override
    public void strategySMethod() {
        System.out.println("策略1");
    }
}

class Strategy2 implements Strategy {
    @Override
    public void strategySMethod() {
        System.out.println("策略2");
    }
}

class Strategy3 implements Strategy {
    @Override
    public void strategySMethod() {
        System.out.println("策略3");
    }
}

class UseStrategy {


    public static void UseStrategyMethod(Strategy strategy) {
        strategy.strategySMethod();
    }

    public static void main(String[] args) {
        UseStrategyMethod(new Strategy1());
        UseStrategyMethod(new Strategy2());
        UseStrategyMethod(new Strategy3());
    }
}