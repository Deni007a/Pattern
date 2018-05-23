package cтруктурные.template_method;

public class Main {

    public static void main(String[] args) {

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nДелаем чай...");
        teaHook.prepareRecipe();

        System.out.println("\nДелаем коффе...");
        coffeeHook.prepareRecipe();
    }
}
