package dom2;

public class Text {
    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        drawMap(new Cycle());
        drawMap(new Rect());
    }
}
