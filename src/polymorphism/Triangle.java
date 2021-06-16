package polymorphism;

public class Triangle extends Shape {
    private String name = "triangle";

    @Override
    public void draw() {
        System.out.println(messageForDrawing + name);
    }

    @Override
    public void erase() {
        System.out.println(messageForErasing + name);
    }
}
