package разные.ImmutableObject;


// делаем клас неизменяемым
public class Point2D2 implements ImmutablePoint2D{
    private int x;
    private int y;
    public Point2D2(int x, int y) { this.x = x; this.y = y; }

    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public void setX(int newX) { this.x = newX; }
    public void setY(int newY) { this.y = newY; }
}
