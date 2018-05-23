package порождающие.Bilder_Pattern.Builder.item;

import порождающие.Bilder_Pattern.Builder.pasking.Packing;
import порождающие.Bilder_Pattern.Builder.pasking.Wrapper;

//Создавайте абстрактные классы, реализующие интерфейс элемента,
// предоставляющий функции по умолчанию.
public abstract class Burger implements Item {

    @Override
   abstract public String name();


    // реализуем упаковку

    // общий у всех метод упаколвки
    @Override
    public Packing packing() {
        //упаковыаем в упаковку
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
