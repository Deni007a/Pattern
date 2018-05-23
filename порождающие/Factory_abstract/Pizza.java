package порождающие.Factory_abstract;

import порождающие.Factory_abstract.Components.Pepperoni;
import порождающие.Factory_abstract.Components.Veggies;

public abstract class Pizza {
	String name;


	Veggies veggies[];
	Pepperoni pepperoni;


	abstract void prepare();

	void bake() {
		System.out.println("Выпекаем 25 минут");
	}

	void cut() {
		System.out.println("Режем по диагонали");
	}

	void box() {
		System.out.println("Упаковываем");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- " + name + " ----\n");

		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length-1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}

		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
