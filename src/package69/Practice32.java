package package69;

import java.util.*;

/**
 * @ClassName Practice32
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/13 15:35
 * @Version 1.0
 */

class PetSequence {
    protected Pet[] pets = {
            new Dog("Fat dog"),
            new Cat("Fat cat"),
            new Hamster("Fat hamster"),
    };
}

public class Practice32 extends PetSequence implements Iterable {

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index;

            @Override
            public Object next() {
                if (hasNext())
                    return pets[index++];
                throw new NoSuchElementException();
            }

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }
        };
    }

    public Iterable reversed() {
        return () -> new Iterator() {
            private int index = pets.length - 1;

            private Object object;

            @Override
            public Object next() {
                if (hasNext())
                    return pets[index--];
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
            var aList = new ArrayList<>(Arrays.asList(pets));
            Collections.shuffle(aList, new Random(47));
            return aList.iterator();
        };
    }

    public static void main(String[] args) {
        var p = new Practice32();
        for (var i : p) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (var j : p.reversed()) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (var k : p.randomSize()) {
            System.out.print(k + " ");
        }
        System.out.println();

    }
}
