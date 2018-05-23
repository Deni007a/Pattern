package порождающие.Factory_abstract;

import порождающие.Factory_abstract.Components.Pepperoni;
import порождающие.Factory_abstract.Components.Veggies;

public interface PizzaIngredientFactory {


	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	;
 
}
