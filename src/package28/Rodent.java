package package28;

/**
 * @ClassName Rodent
 * @Description 引用计数法简单实现
 * @Author tanwenwei
 * @Date 2019/4/15 22:04
 * @Version 1.0
 */

public class Rodent {
    Emotion superEmotion;

    Rodent(Emotion emotion) {
        System.out.println("create  Rodent");
        this.superEmotion = emotion;
        emotion.addRef();
    }

    protected void dispose() {
        System.out.println("dispose  Rodent");
        superEmotion.refCount--;
        if (superEmotion.refCount == 0) {
            superEmotion.dispose();
        }
    }

    public String toString() {
        return "Rodent";
    }

}

class Mouse extends Rodent {

    Emotion selfEmotion;

    Mouse(Emotion faEmotion, Emotion sonEmotion) {
        super(faEmotion);
        System.out.println("create  Mouse");
        this.selfEmotion = sonEmotion;
        sonEmotion.addRef();
    }

    @Override
    protected void dispose() {
        System.out.println("dispose " + this);
        selfEmotion.refCount--;
        if (selfEmotion.refCount == 0) {
            selfEmotion.dispose();
        }
        super.dispose();
    }

    public String toString() {
        return "Mouse";
    }

}

class Gerbil extends Rodent {
    Emotion selfEmotion;

    Gerbil(Emotion faEmotion, Emotion sonEmotion) {
        super(faEmotion);
        System.out.println("create  Gerbil");
        this.selfEmotion = sonEmotion;
        sonEmotion.addRef();
    }

    public void dispose() {
        System.out.println("dispose " + this);
        selfEmotion.refCount--;
        if (selfEmotion.refCount == 0) {
            selfEmotion.dispose();
        }
        super.dispose();
    }

    @Override
    public String toString() {
        return "Gerbil";
    }
}


class Hamster extends Rodent {
    Emotion selfEmotion;

    Hamster(Emotion faEmotion, Emotion sonEmotion) {
        super(faEmotion);
        System.out.println("create Hamster");
        this.selfEmotion = sonEmotion;
        sonEmotion.addRef();
    }

    public void dispose() {
        System.out.println("dispose " + this);
        selfEmotion.refCount--;
        if (selfEmotion.refCount == 0) {
            selfEmotion.dispose();
        }
        super.dispose();
    }

    @Override
    public String toString() {
        return "Hamster";
    }

}

class Emotion {

    public int refCount = 0;

    public static int count = 0;

    public final int id = count++;

    Emotion(String str) {

        System.out.println("create " + id);
        System.out.println(str + " scared cat");
    }


    void addRef() {
        refCount++;
    }

    protected void dispose() {
        System.out.println("dispose " + this);
    }

    @Override
    public String toString() {
        return "emotion " + id;
    }

}

class TestRodent {
    public static void main(String[] args) {

        var faEmotion = new Emotion("fa");

        var sonEmotion = new Emotion("son");

        Rodent[] rodents = {
                new Rodent(faEmotion),
                new Mouse(faEmotion, sonEmotion),
                new Gerbil(faEmotion, sonEmotion),
                new Hamster(faEmotion, sonEmotion),
        };

        for (var rodent : rodents) {
            rodent.dispose();
        }
    }
}