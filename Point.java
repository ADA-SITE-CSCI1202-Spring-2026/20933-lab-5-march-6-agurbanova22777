public class Point implements Movable {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(0, 0);
        System.out.println("Initial Position: " + p);
        p.moveUp();
        System.out.println("After moveUp: " + p);
        p.moveRight();
        System.out.println("After moveRight: " + p);
    }
}