public class Circle implements Movable {
    private Point center;
    private int radius;

    public Circle(int x, int y, int radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "Circle[center=" + center + ", radius=" + radius + "]";
    }

    public static void main(String[] args) {
        Circle c = new Circle(0, 0, 5);
        System.out.println("Initial Position: " + c);
        c.moveUp();
        System.out.println("After moveUp: " + c);
        c.moveRight();
        System.out.println("After moveRight: " + c);
    }
}