package cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class.beverage;

import cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class.Beverage;

public class Dark_Roast  extends Beverage  /* темная обжарка */ {

    // описание напитка задаем в конструкторе
    public Dark_Roast() {
        description ="Темная обжарка ";
    }

    @Override
    public double cost() {
        return 1.10+getSize().costSize(); // Добовляем цену за размер порции
    }



}
