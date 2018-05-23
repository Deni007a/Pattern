package cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class;

public class Cinnamon  extends Beverage_Decorator{
    Beverage beverage;

    public Cinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Корица";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }
}
