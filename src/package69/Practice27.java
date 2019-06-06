package package69;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Practice27
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/8 14:08
 * @Version 1.0
 */
class Command {
    String name;

    public Command(String name) {
        this.name = name;
    }

    void operation() {
        System.out.println(name);
    }
}

class Second {

    public Command addCommand(Command command, Queue<Command> queue) {
        queue.offer(command);
        return command;
    }
}

class Third {
    public void useQueue(Queue<Command> queue) {
        var it = queue.iterator();
        while (it.hasNext()) {
            var c = it.next();
            it.remove();
            c.operation();
        }

    }
}

public class Practice27 {

    public static void main(String[] args) {
        Command[] commands = {
                new Command("成都"),
                new Command("上海"),
                new Command("广州"),
                new Command("北京"),
        };
        var se = new Second();
        var que = new LinkedList<Command>();
        for (var c : commands) {
            se.addCommand(c, que);
        }
        var th = new Third();
        th.useQueue(que);
    }
}
