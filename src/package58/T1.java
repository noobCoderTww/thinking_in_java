package package58;

/**
 * @ClassName T1
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/26 9:36
 * @Version 1.0
 */

public abstract class T1 {
    abstract void m();//如果有该抽象方法 那么外包的类就无法继承T1，注意抽象类中的抽象方法不能是private的
}
