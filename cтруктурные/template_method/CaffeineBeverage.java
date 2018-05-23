package cтруктурные.template_method;

// абстрактный метод
public abstract class CaffeineBeverage {

    // шаблонный  метод обявляем финальным чтобы субклассы
    // не могли изменитьт  его последовательность

    final void prepareRecipe() {
        boilWater(); // кипячение воды
        brew(); // варка
        pourInCup(); // наливать в чашку
       // включаем перехватчик в код
        if (customerWantsCondiments()) {
            addCondiments(); // добовление припав
        }
    }

    abstract void brew(); // абстрактные медоты для переопределения в субклассах

    abstract void addCondiments();

    void boilWater() {     // конкретные методы
        System.out.println("Кипячение воды");
    }

    void pourInCup() {
        System.out.println("Наливаем в чашку");
    }
    // перехвадчик
    boolean customerWantsCondiments() {
        return true;
    }
}