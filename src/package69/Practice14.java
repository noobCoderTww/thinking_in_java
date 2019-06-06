package package69;

import java.util.LinkedList;

/**
 * @ClassName Practice14
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/5 14:33
 * @Version 1.0
 */

public class Practice14 {

    public LinkedList setEle(LinkedList<Integer> linkedList) {
        for (var i = 0; i < 5; i++) {
            var it = linkedList.listIterator(linkedList.size() % 2 == 0 ? linkedList.size() / 2 : linkedList.size() / 2 + 1);
            it.add(i);
        }
        return linkedList;
    }

    public static class Inner1 {
        public static void main(String[] args) {
            var l1 = new LinkedList<Integer>();
            for (var i = 0; i < 4; i++) {
                l1.add(5);
            }
            new Practice14().setEle(l1);
            System.out.println(l1);
        }
    }
}
