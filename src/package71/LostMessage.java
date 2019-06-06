package package71;

/**
 * @ClassName LostMessage
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/22 9:46
 * @Version 1.0
 */

class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "a very important exception";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "a trivial exception";
    }
}

class MoreException extends Exception {
    @Override
    public String toString() {
        return "more exception";
    }
}

public class LostMessage {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void h() throws MoreException {
        throw new MoreException();
    }

    public static void main(String[] args) {

        try {
            var l = new LostMessage();
            try {
                try {
                    l.f();
                } finally {
                    l.dispose();
                }
            } finally {
                l.h();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
