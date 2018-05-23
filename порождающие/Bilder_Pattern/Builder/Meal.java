package порождающие.Bilder_Pattern.Builder;

import порождающие.Bilder_Pattern.Builder.item.Item;

import java.util.ArrayList;
import java.util.List;
// клас еды имеющий   стисок интермов
// абстрактыне классы  содержат интерфем интем
public class Meal {
    // список интемов
    private List<Item> items = new ArrayList<Item>();
        // добавить
    public void addItem(Item item){
        items.add(item);
    }
    // пощитать цену
    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }
// показать интем
    public void showItems(){

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}