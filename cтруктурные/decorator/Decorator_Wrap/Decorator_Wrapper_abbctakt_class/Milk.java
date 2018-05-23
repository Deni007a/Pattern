package cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class;

public class Milk extends Beverage_Decorator {



    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Молоко";
    }

    @Override
    public double cost() {
        return 0.20 +beverage.cost();
    }
}
