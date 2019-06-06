package package70;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * @ClassName ForEachCollections
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/10 17:25
 * @Version 1.0
 */

public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> c = new LinkedList<>();
        String arrStr = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        for (var str : arrStr.split(" ")) {
            c.add(str);
        }
        for (var s : c) {
            System.out.print(s + " ");
        }
    }
}

class ImpIterable<T> implements Iterable<T> {


    public static void main(String[] args) {
        for (var i : new ImpIterable()) {
            System.out.println(i);
        }
    }

    private String[] arrStr = {
            "java",
            "python",
            "c",
            "c++",
            "kotlin",
            "Ruby",
            "Php",
            "GoLang",
            "javaScript"
    };


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < arrStr.length ;
            }

            @Override
            public T next() {
                if (index == arrStr.length) {
                    throw new NoSuchElementException();
                }
                return (T) arrStr[index++];
            }
        };
    }
}

class EnvironmentVariables {
    public static void main(String[] args) {
        for (var s : System.getenv().entrySet()) {
            System.out.println(s.getKey() + ":" + s.getValue());
        }
    }
}