/**
 * @ClassName TestArray
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/3/29 13:55
 * @Version 1.0
 */

public class TestArray {
    TestArray() {
        System.out.println("测试");
    }

    public static void main(String[] args) {
        Amain.main("31231", "31231", "uyrttrytry");
    }
}

class Other {
    public static void main(String[] args) {
        kbArgs("dasd", "dsad", "ffdf");
        kbArgs(new String[]{
                "dasd",
                "dasdfgdg"
        });
    }

    public static void kbArgs(String... args) {
        for (var str : args) {
            System.out.println(str);
        }
    }
}

class Amain {
    public static void main(String... args) {
        for (var str : args) {
            System.out.println(str);
        }
    }
}

enum FamilyMember {
    SON, FATHER, MOM
}

class TestEnum {

    public static void pipei(FamilyMember member) {
        switch (member) {
            case MOM:
                System.out.println(FamilyMember.MOM);
                break;
            case SON:
                System.out.println(FamilyMember.SON);
                break;
        }
    }

    public static void main(String[] args) {
        pipei(FamilyMember.MOM);
        var values = FamilyMember.values();
        for (var val : values) {
            System.out.println(val);
        }
        System.out.println(FamilyMember.SON.ordinal());
    }
}


enum RMB {
    JIAO,FEN,LI,YUAN
}
