package порождающие.Factory_Method;

public class ClamPizza extends Pizza {
	public ClamPizza() {
		name = "Пица из морепродуктов";
		dough = "Тонкое тесто";
		sauce = "Чесночный соус";
		toppings.add("Молюски");
		toppings.add("Прамесан");
	}
}
