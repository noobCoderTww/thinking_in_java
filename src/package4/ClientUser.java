package package4;


import package3.ConnectionManager;

/**
 * @ClassName ClientUsert
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/3 9:21
 * @Version 1.0
 */

public class ClientUser {

    public static void main(String[] args) {
        var conn0 = ConnectionManager.getConn();
        var conn1 = ConnectionManager.getConn();
        var conn2 = ConnectionManager.getConn();
        var conn3 = ConnectionManager.getConn();
        var conn4 = ConnectionManager.getConn();
        conn0.m();
        conn1.m();
        conn2.m();
        conn3.m();
        //conn4.m();会报错 因为拿到的是空引用
    }
}
