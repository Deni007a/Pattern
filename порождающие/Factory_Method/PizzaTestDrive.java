package порождающие.Factory_Method;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("pepperoni");
		System.out.println("We ordered a " + pizza.getName() + "\n");
 
		pizza = store.orderPizza("clam");
		System.out.println("We ordered a " + pizza.getName() + "\n");
	}
}
