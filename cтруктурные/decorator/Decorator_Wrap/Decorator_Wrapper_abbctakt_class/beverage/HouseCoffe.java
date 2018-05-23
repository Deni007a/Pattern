package cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class.beverage;

import cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class.Beverage;

public class HouseCoffe  extends Beverage{

    public HouseCoffe() {
        description="Домаший кофе";
    }

    @Override
    public double cost() {
        return 2.00+getSize().costSize(); // Добовляем цену за размер порции
    }
}
