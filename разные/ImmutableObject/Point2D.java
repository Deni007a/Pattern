package разные.ImmutableObject;
//Класс Point2D является изменяемым: его состояние может быть изменено
// после создания, если вызвать один из методов-сеттеров (setX() или setY()
public class Point2D {
    private int x;
    private int y;
    public Point2D(int x, int y) { this.x = x; this.y = y; }

    public int getX() { return this.x; }
    public int getY() { return this.y; }

    public void setX(int newX) { this.x = newX; }
    public void setY(int newY) { this.y = newY; }
}