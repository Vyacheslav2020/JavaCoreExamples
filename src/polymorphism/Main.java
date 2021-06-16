package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Triangle(), new Rectangle(), new Square()};

        for (Shape shape : shapes) {
            doSomething(shape);
        }
    }

    private static void doSomething(Shape shape) {
        shape.draw();
        shape.erase();
        System.out.println();
    }
}
