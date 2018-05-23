package порождающие.Prototype;

import java.util.Hashtable;


//Создаем класс, чтобы получить конкретные классы из базы данных и сохранить
// их в Hashtable.

// по сути это хранилище протопитов в колекции  из которых мы их извлекаем

// тут и плонируем
public class ShapeCache  {

    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId)  {
        // получаем фигуру  из мар по ид
        Shape cachedShape = shapeMap.get(shapeId);
        // ТУТ  клонируем фигуру, то есть возвращаем клонированую фигуру
        return (Shape) cachedShape.clone();



        // return  cachedShape;  //  просто возвращаем без клонирования
    }


    // делем метод где добовляем в мар ти фигуры

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}