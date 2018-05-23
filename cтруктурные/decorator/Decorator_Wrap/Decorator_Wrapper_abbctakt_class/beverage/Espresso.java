package cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class.beverage;

import cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class.Beverage;

public class Espresso extends Beverage {
// описание напитка задаем в конструкторе
    public Espresso() {
        description ="Еспрессо";
    }

    @Override
    public double cost() {
        return 1.0+getSize().costSize(); // Добовляем цену за размер порции
    }
}
