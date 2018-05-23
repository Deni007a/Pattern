package cтруктурные.decorator.Decorator_Wrap.Decirator_intexfes;

public class Cola implements Beverage {
    @Override
    public String getDescription() {
        return "кола";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
