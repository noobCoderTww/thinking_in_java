package package30;

/**
 * @ClassName Transmogrify
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/16 22:06
 * @Version 1.0
 */

public class Transmogrify {
    public static void main(String[] args) {
        var starship = new Starship();
        starship.changeToPoliceAlertStatus();
        starship.alertRun();

    }
}

class Starship {

    AlertStatus a1 = new AlertStatus();

    public void changeToWuWuAlertStatus() {
        a1 = new WuWuAlertStatus();
    }

    public void changeToDongDongAlertStatus() {
        a1 = new DongDongAlertStatus();
    }

    public void changeToPoliceAlertStatus() {
        a1 = new PoliceAlertStatus();
    }

    public void alertRun() {
        a1.alertStatusClock();
    }
}

class AlertStatus {

    public void alertStatusClock() {

    }

}

class WuWuAlertStatus extends AlertStatus {

    @Override
    public void alertStatusClock() {
        System.out.println("wuwuwuwu!");
    }
}

class DongDongAlertStatus extends AlertStatus {

    @Override
    public void alertStatusClock() {
        System.out.println("DongDong!");
    }
}

class PoliceAlertStatus extends AlertStatus {

    @Override
    public void alertStatusClock() {
        System.out.println("Police!");
    }

}