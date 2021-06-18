package polymorphism;

abstract class Shape implements Doable {
    private static final String NONE = "none";
    String name;

    Shape() {
        name = NONE;
    }

    @Override
    public void draw() {
        final String messageForDrawing = "Drawing ";
        System.out.println(messageForDrawing + name);
    }

    @Override
    public void erase() {
        final String messageForErasing = "Erasing ";
        System.out.println(messageForErasing + name);
    }
}
