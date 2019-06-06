package package69;

/**
 * @ClassName Practice15
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/5 16:20
 * @Version 1.0
 */

public class Practice15 {

    //65-90 A-Z 97-122 a-z
    public void analyticExpression(Stack<Character> stack, String expression) {
        char[] charArray = expression.toCharArray();
        var index = 0;
        while (index < charArray.length) {
            switch (charArray[index]) {
                case '+':
                    stack.push(charArray[index + 1]);
                    index += 2;
                    break;
                case '-':
                    var c = stack.pop();
                    System.out.print(c + " ");
                    index++;
                    break;
        }
        }
    }

    private static class InnerClass {
        public static void main(String[] args) {
            var p15 = new Practice15();
            var s1 = new Stack<Character>();
            p15.analyticExpression(s1, "+U+n+c---+e+r+t---+a-+i-+n+i+y---+-+r+u--+l+e+s");

            while (!s1.isEmpty()) {
                System.out.print(s1.pop() + " ");
            }

        }
    }
}