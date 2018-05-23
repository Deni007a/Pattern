package cтруктурные.decorator.Decorator_Wrap.Decirator_intexfes;

public class Ice implements Beverage_Decorator {
    Beverage beverage;

    public Ice(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" лед ";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.90;
    }
}
