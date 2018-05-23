package cтруктурные.decorator.Decorator_Wrap.Decirator_intexfes;
// создаем напиток
public class Tea  implements Beverage{
    @Override
    public String getDescription() {
        return "Чай";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
