package package3;

/**
 * @ClassName ConnectionManager
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/2 0:00
 * @Version 1.0
 */

public class ConnectionManager {

    private static Connection[] conns;

    private static int count = 0;

    static {
        conns = Connection.getConnection();
    }

    public static Connection getConn() {
        count++;
        if (count < conns.length + 1) {
            return conns[count - 1];
        }
        return null;
    }

}
