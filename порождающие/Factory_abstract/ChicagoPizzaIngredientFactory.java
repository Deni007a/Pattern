package порождающие.Factory_abstract;

import порождающие.Factory_abstract.Components.*;

public class ChicagoPizzaIngredientFactory
        implements PizzaIngredientFactory {


    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }


}
