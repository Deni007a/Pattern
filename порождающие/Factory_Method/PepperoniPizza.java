package порождающие.Factory_Method;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		name = "Пеперони питца";
		dough = "Обычное тесто";
		sauce = "Маринадный соус";
		toppings.add("Паперонни");
		toppings.add("Лук");
		toppings.add("Прамезан");
	}
}
