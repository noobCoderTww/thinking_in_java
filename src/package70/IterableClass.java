package package70;

import java.util.*;

/**
 * @ClassName IterableClass
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/13 14:14
 * @Version 1.0
 */

public class IterableClass implements Iterable {


    protected String[] strings = {
            "java",
            "c",
            "c++",
            "python",
            "javascript",
            "c#",
            "goLang",
            "swift",
            "kotlin",
            "Php",
            "ruby",
            "perl",
            "sql",
            "scala"
    };


    @Override
    public Iterator iterator() {
        return new Iterator() {


            private int index;

            @Override
            public String next() {
                if (hasNext()) {
                    return strings[index++];
                }
                throw new NoSuchElementException();
            }

            @Override
            public boolean hasNext() {
                return index < strings.length;
            }
        };
    }

    private static class Inner {
        public static void main(String[] args) {
            for (var i : new IterableClass()) {
                System.out.println(i);
            }
        }
    }
}

class MutiIterableClass extends IterableClass {


    public Iterable reversed() {
        return () -> new Iterator() {
            private int index = strings.length - 1;

            @Override
            public Object next() {
                if (hasNext())
                    return strings[index--];
                throw new NoSuchElementException();
            }

            @Override
            public boolean hasNext() {
                return index > -1;
            }
        };
    }


    public Iterable randomSize() {
        return () -> {
          /*  var alist = new ArrayList<>();
            Collections.addAll(alist, strings);*/
            var tList = new ArrayList<>(Arrays.asList(strings));
            Collections.shuffle(tList, new Random(47));
            return tList.iterator();
        };
    }

    public static void main(String[] args) {
        for (var i : new MutiIterableClass()) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (var j : new MutiIterableClass().reversed()) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (var k : new MutiIterableClass().randomSize()) {
            System.out.print(k + " ");
        }
    }
}