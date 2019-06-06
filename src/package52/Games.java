package package52;

/**
 * @ClassName Games
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/23 10:53
 * @Version 1.0
 */
interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private int moves = 0;

    private static final int MOVES = 3;

    @Override
    public boolean move() {
        System.out.println("checkers move " + moves);
        return ++moves != MOVES;
    }

}

class CheckersFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Checkers();
    }
}

class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    @Override
    public boolean move() {
        System.out.println("Chess moves " + moves);
        return ++moves != MOVES;
    }
}


class ChessFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Chess();
    }
}

public class Games {

    public static void playGame(GameFactory gameFactory) {
        var game = gameFactory.getGame();
        while (game.move()) {

        }
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
