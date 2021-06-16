package polymorphism;

public class Square extends Shape {
    private String name = "square";

    @Override
    public void draw() {
        System.out.println(messageForDrawing + name);
    }

    @Override
    public void erase() {
        System.out.println(messageForErasing + name);
    }
}
