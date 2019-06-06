package package69;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * @ClassName Practice31
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/13 10:09
 * @Version 1.0
 */

class Shape {
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

}

class Triangle extends Shape {

}


class Line extends Shape {

}

class Circle extends Shape {

}


public class Practice31 implements Iterable<Shape> {
    private static Random random = new Random(47);

    private Shape[] shapes;

    public Practice31(int size) {
        shapes = new Shape[size];
        for (var i = 0; i < size; i++) {
            shapes[i] = getShape();
        }
    }

    public Shape getShape() {

        switch (random.nextInt(3)) {
            case 0:
                return new Line();
            case 1:
                return new Circle();
            case 2:
                return new Triangle();
        }
        return new Shape();
    }

    public Iterator<Shape> iterator() {


        return new Iterator<>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < shapes.length;
            }

            @Override
            public Shape next() {
                if (hasNext())
                    return shapes[index++];
                else {
                    throw new NoSuchElementException();
                }
            }
        };
    }

    public static void main(String[] args) {
        for (var i : new Practice31(10)) {
            System.out.println(i);
        }
    }
}
