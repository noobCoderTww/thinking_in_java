package package3;

/**
 * @ClassName Connection
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/3 9:12
 * @Version 1.0
 */

public class Connection {



    private static Connection[] conns = {
            new Connection(),
            new Connection(),
            new Connection(),
            new Connection()
    };

    private Connection() {

    }

    static Connection[] getConnection() {
        return conns;
    }

    public void m() {
        System.out.println("对象");
    }
}
