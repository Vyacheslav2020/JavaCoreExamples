package polymorphism;

public class Rectangle extends Shape {
    private String name = "rectangle";

    @Override
    public void draw() {
        System.out.println(messageForDrawing + name);
    }

    @Override
    public void erase() {
        System.out.println(messageForErasing + name);
    }
}
