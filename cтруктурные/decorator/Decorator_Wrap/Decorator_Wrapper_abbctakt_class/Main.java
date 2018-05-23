package cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class;

import cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class.beverage.Espresso;

public class Main {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        beverage1.setSize(Beverage.Size.VENTI);// меняем порцию на большую
        System.out.println(beverage1.getDescription() + " $ "+ beverage1.cost());


        // Оборачиваем
       beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDescription()+" $ "+ beverage1.cost());
        // оборачиваем еще раз
        beverage1 = new Cinnamon(beverage1);

        System.out.println(beverage1.getDescription()+" $ "+ beverage1.cost());

        //Beverage beverage3 = new HouseCoffe();
        //beverage3 = new Milk()
        //System.out.println(beverage2.getDescription()+" $ "+ beverage2.cost());
    }
}
