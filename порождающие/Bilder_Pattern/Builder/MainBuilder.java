package порождающие.Bilder_Pattern.Builder;


//Мы рассмотрели бизнес-пример ресторана быстрого питания, где типичной едой может быть
// гамбургер и холодный напиток. Burger может быть либо Veg Burger, либо куриным Burger
// и будет упакован оберткой.
// Холодным напитком может быть либо сок, либо пепси, и он будет упакован в бутылку.

// Мы собираемся создать интерфейс элемента, представляющий такие продукты,
// как гамбургеры и холодные напитки, а также конкретные классы, реализующие интерфейс
// Item, и интерфейс упаковки, представляющий упаковку продуктов питания и конкретных классов, реализующих интерфейс упаковки, в качестве гамбургера, будут упакованы в обертку и холодный напиток будет упакован как бутылка.

public class MainBuilder {
    public static void main(String[] args) {
        // создаем клас где делается еда
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

}
