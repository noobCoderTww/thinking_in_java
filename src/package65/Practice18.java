package package65;

/**
 * @ClassName Practice18
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/28 9:29
 * @Version 1.0
 */

public class Practice18 {

    private static class SInner1 {

    }


    static class SInner2 {

    }


    protected static class SInner3 {

    }

    public static class SInner4 {

    }

    public static void main(String[] args) {
        var p = new Practice18();
        //var s1 = p.new SInner1();   不能这么创建嵌套类
        // var s1 = new p.SInner1();  不能这么创建嵌套类
        var s1 = new Practice18.SInner1();  // 可以这么创建
    }
}
