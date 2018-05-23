package cтруктурные.decorator.Decorator_Wrap.Decirator_intexfes;
// декораторы  добовляем в  напиток молоко
public class Milk  implements Beverage_Decorator{

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" молоко";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.20;
    }
}
