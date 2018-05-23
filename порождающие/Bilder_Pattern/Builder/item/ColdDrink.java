package порождающие.Bilder_Pattern.Builder.item;


import порождающие.Bilder_Pattern.Builder.pasking.Bottle;
import порождающие.Bilder_Pattern.Builder.pasking.Packing;

public abstract class ColdDrink implements Item {

    @Override
    abstract public String name();
// общий у всех метод упаковки
    @Override
    public Packing packing() {
        //упаковываем в бутылку
        return new Bottle();
    }

    @Override
    public abstract float price();
}

