package package72;

/**
 * @ClassName StormyInning
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/22 16:27
 * @Version 1.0
 */
class BaseballException extends Exception {

}

class Foul extends BaseballException {

}

class Strike extends BaseballException {

}

abstract class Inning {
    public Inning() throws BaseballException {

    }

    public void event() throws BaseballException {

    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {

    }
}

class StormException extends Exception {

}

class RainedOut extends StormException {

}

class PopFoul extends Foul {

}

interface Storm {
    void event() throws RainedOut;

    void rainHard() throws RainedOut;
}


public class StormyInning extends Inning implements Storm {


    public StormyInning() throws RainedOut, BaseballException {

    }

    public StormyInning(String s) throws Foul, BaseballException {

    }

    @Override
    public void atBat() throws PopFoul {

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    @Override
    public void event() {


        new StringBuilder().append("dsd" + "dasda" + "dasfa");
    }
}
