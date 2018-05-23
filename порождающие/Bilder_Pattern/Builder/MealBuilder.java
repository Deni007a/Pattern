package порождающие.Bilder_Pattern.Builder;


import порождающие.Bilder_Pattern.Builder.item.ChickenBurger;
import порождающие.Bilder_Pattern.Builder.item.Coke;
import порождающие.Bilder_Pattern.Builder.item.Pepsi;
import порождающие.Bilder_Pattern.Builder.item.VegBurger;

//класс MealBuilder, фактический класс строителя, ответственный за создание объектов Meal.
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
