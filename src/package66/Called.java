package package66;

/**
 * @ClassName Callback
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/29 9:56
 * @Version 1.0
 */

public class Called {

    public void called(BeCalled beCalled) {
        beCalled.response(this);
    }

    public void callback() {
        System.out.println("被调用的对象的方法已经执行完了 小老弟");
    }
}

class BeCalled {

    public void response(Called called) {
        try {
            System.out.println("回调方叫我们赶快回答的他的问题，搞定了要告诉他");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        called.callback();
    }

}