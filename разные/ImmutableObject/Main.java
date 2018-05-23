package разные.ImmutableObject;

public class Main {
    public static void main(String[] args) {
        // на конкретный экземпляр Point2D2 ссылается неизменяемый интерфейс
        ImmutablePoint2D point = new Point2D2(0,0);
        int х = point.getX(); // допустимый вызов метода
        // ошибка компиляции: метод setX() не существует в типе ImmutablePoint2D
        // как как  сеттеров в интерфесе нету
        //point.setX(42);

        // но  неимзменность можно  одобойти приведением типов
        ((Point2D2)point).setX(42);
    }
}
