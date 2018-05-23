package cтруктурные.decorator.Decorator_Wrap.Decirator_intexfes;

public class Main {
    public static void main(String[] args) {

        Beverage beverage1 = new Tea();
        System.out.println(beverage1.getDescription() + " $ "+beverage1.cost());


        Beverage beverage2= new Milk(beverage1);
        System.out.println(beverage2.getDescription() + " $ "+beverage2.cost());

        Beverage beverage3= new Cinnamon(beverage2);
        System.out.println(beverage3.getDescription() + " $ "+beverage3.cost());

    }


}
