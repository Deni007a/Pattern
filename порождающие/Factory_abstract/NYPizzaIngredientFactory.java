package порождающие.Factory_abstract;

import порождающие.Factory_abstract.Components.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 

 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}


}
