package package68;

/**
 * @ClassName XiaoMing
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/30 10:51
 * @Version 1.0
 */


interface Partner {
    void dosth(Partner partner);

    void doSthTogether(Partner partner);
}

interface WaitPartner {
    void waitP(Partner partner);
}

public class XiaoMing implements Partner, WaitPartner {


    XiaoMing() {

    }


    @Override
    public void doSthTogether(Partner partner) {
        System.out.println(getClass().getSimpleName() + "和" + partner.getClass().getSimpleName() + "一起打牌");
    }

    @Override
    public void dosth(Partner partner) {
        System.out.println(getClass().getSimpleName() + "去恰饭");
        partner.doSthTogether(partner);
    }

    @Override
    public void waitP(Partner partner) {
        System.out.println(getClass().getSimpleName() + "先等哈" + partner.getClass().getSimpleName() + "那个龟孙儿");
        partner.dosth(partner);
    }
}

class XiaoLi implements Partner, WaitPartner {


    XiaoLi() {

    }

    @Override
    public void doSthTogether(Partner partner) {
        System.out.println(getClass().getSimpleName() + "和" + partner.getClass().getSimpleName() + "一起上网");
    }

    @Override
    public void dosth(Partner partner) {
        System.out.println(getClass().getSimpleName() + "去洗澡");
        partner.doSthTogether(partner);
    }

    @Override
    public void waitP(Partner partner) {
        System.out.println(getClass().getSimpleName() + "先等哈" + partner.getClass().getSimpleName() + "那个龟孙儿");
        partner.dosth(partner);
    }
}

class Te {

    public static void main(String[] args) {
        var xiaoLi = new XiaoLi();
        var xiaoming = new XiaoMing();
        /*xiaoLi.waitP(xiaoming);*/
        xiaoming.waitP(xiaoLi);
    }
}