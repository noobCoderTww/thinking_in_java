package package57;

import package56.Base;
import package56.Interface1;
import package56.UseInteface1;

/**
 * @ClassName OtherClazz
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/23 22:29
 * @Version 1.0
 */

public class OtherClazz {
    public static void main(String[] args) {
        var i1 = Interface1.I;
        var u1 = new UseInteface1();
        var i2 = u1.getInterface1();
        var export = Base.getExport();
    }
}
