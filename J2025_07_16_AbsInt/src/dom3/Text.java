package dom3;


public class Text {
    public static void drawMap(IShape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        Cycle cycle = new Cycle();

        drawMap(cycle);
        drawMap(new Rect());
    }
}
