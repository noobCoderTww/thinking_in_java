package package20;

import java.util.Random;

/**
 * @ClassName Shape
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/8 17:22
 * @Version 1.0
 */

public class Shape  {
    public void draw() {

        System.out.println("draw shape");
    }

    public void erase() {
        System.out.println("erase shape");
    }

    public void pra() {
        System.out.println("111");
    }
}


class Line extends Shape {

    @Override
    public void draw() {
        System.out.println("draw line");
    }

    @Override
    public void erase() {
        System.out.println("erase line");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    @Override
    public void erase() {
        System.out.println("erase circle");
    }

    @Override
    public void pra() {
        System.out.println(222);
    }
}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("draw triangle");
    }

    @Override
    public void erase() {
        System.out.println("erase triangle");
    }
}

class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("draw square");
    }

    @Override
    public void erase() {
        System.out.println("erase square");
    }
}


class ShapeFactory {
    private static Random random = new Random(47);

    public static Shape getShape() {

        switch (random.nextInt(4)) {
            case 0:
                return new Line();
            case 1:
                return new Circle();
            case 2:
                return new Triangle();
            case 3:
                return new Square();
        }
        return new Shape();
    }
}

class Test {
    public static void main(String[] args) {
        var shapeArray = new Shape[9];
        var shapeFactory = new ShapeFactory();

        for (var i = 0; i < 9; i++) {
            shapeArray[i] = shapeFactory.getShape();
        }

        for (var shape : shapeArray) {
            shape.draw();
        }

    }
}