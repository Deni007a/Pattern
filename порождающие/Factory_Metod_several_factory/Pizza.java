package порождающие.Factory_Metod_several_factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println("Подготовка " + name);
        System.out.println("Формовка теста...");
        System.out.println("Добовление соуса...");
        System.out.println("Добовление компонентов: ");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    void bake() {
        System.out.println("Выпечка ");
    }

    void cut() {
        System.out.println("Нарезка по диогонали");
    }

    void box() {
        System.out.println("Упаковка");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}