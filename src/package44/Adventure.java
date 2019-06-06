package package44;

import java.util.Scanner;

/**
 * @ClassName Adventure
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/20 12:11
 * @Version 1.0
 */

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}


interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void fight() {
        System.out.println("fight");
    }
}

class ActionActor extends ActionCharacter implements CanFight, CanFly, CanSwim {
    @Override
    public void fight() {
        System.out.println("action fight");
    }

    @Override
    public void swim() {
        System.out.println("action swim");
    }

    @Override
    public void fly() {
        System.out.println("action fly");
    }
}


public class Adventure {
    public void a(CanFight canfight) {
        canfight.fight();
    }

    public void b(CanSwim canSwim) {
        canSwim.swim();
    }

    public void c(CanFly canFly) {
        canFly.fly();
    }

    public void d(ActionCharacter actionCharacter) {
        actionCharacter.fight();
    }

    public void e(ActionActor actionActor) {
        actionActor.fight();
    }

    public void f(ActionActor actionActor) {
        actionActor.fly();
    }

    public void g(ActionActor actionActor) {
        actionActor.swim();
    }

    public static void main(String[] args) {
        var actor = new ActionActor();
        var adventure = new Adventure();
        adventure.a(actor);
        adventure.b(actor);
        adventure.c(actor);
        adventure.d(actor);
        adventure.e(actor);
        adventure.f(actor);
        adventure.g(actor);
        new Scanner("");
    }

}
