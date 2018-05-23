package cтруктурные.decorator.Decorator_Wrap.Decirator_intexfes;

public class Cinnamon implements Beverage_Decorator {
    Beverage beverage;

    public Cinnamon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" кардамон ";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }
}
