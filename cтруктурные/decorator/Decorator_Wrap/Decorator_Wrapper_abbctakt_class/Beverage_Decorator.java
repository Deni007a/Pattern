package cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class;

public  abstract class Beverage_Decorator  extends Beverage{

   abstract public String getDescription();

   public Beverage beverage;
   public Size getSize() {
      return beverage.getSize();
   }

}
