package порождающие.Factory_Method;

import java.util.ArrayList;

abstract public class Pizza {
	String name;
	String dough; // Тесто
	String sauce;  /// соус
	ArrayList<String> toppings = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Подготовка " + name);
	}

	public void bake() {
		System.out.println("Выпечка " + name);
	}

	public void cut() {
		System.out.println("Напрезка " + name);
	}

	public void box() {
		System.out.println("Упаковка " + name);
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (int i = 0; i < toppings.size(); i++) {
			display.append(toppings.get(i) + "\n");
		}
		return display.toString();
	}
}

