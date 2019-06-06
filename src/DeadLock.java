/**
 * @ClassName DeadLock
 * @Description 测试死锁
 * @Author tanwenwei
 * @Date 2019/3/23 13:15
 * @Version 1.0
 */

public class DeadLock {
    static final Object o1 = new Object();
    static final Object o2 = new Object();
    static final Object o3 = o1;
    String str1 = "hello";
    String str2 = "hello";

    void m1() {
        synchronized (o1) {
            System.out.println("dead or not ?");
        }

    }

    void m2() {
        synchronized (o2) {
            System.out.println("dead or not ?");
        }
    }

    void m3() {
        synchronized (o3) {
            System.out.println("dead or not ?");
        }
    }

    void m4() {
        synchronized (str1) {
            System.out.println("dead or not ?");
        }
    }

    void m5() {
        synchronized (str2) {
            System.out.println("dead or not ?");
        }
    }

    public static void main(String[] args) {
        var dead = new DeadLock();
        //一组
        new Thread(() -> {
            dead.m1();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dead.m2();
        }, "t1").start();
        new Thread(() -> {
            dead.m2();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dead.m1();
        }, "t1!").start();
        //二组
        new Thread(() -> {
            dead.m1();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dead.m3();
        }, "t2").start();
        new Thread(() -> {
            dead.m3();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dead.m1();
        }, "t2!").start();
        //三组
        new Thread(() -> {
            dead.m4();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dead.m5();
        }, "t3").start();
        new Thread(() -> {
            dead.m5();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dead.m4();
        }, "t3!").start();
        //四组
        new Thread(() -> {
            dead.m5();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dead.m1();
        }, "t4").start();
        new Thread(() -> {
            dead.m1();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            dead.m4();
        }, "t4!").start();
    }
}