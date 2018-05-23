package поведенчиские.Iterator.Sumple_interator;

// первая реализацию  меню на арай лдисте

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    // храним реализацию в арай листе
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();
// добовляем в  элементы в конструкторе
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries, and blueberry syrup",
                true,
                3.49);

        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
/*
    // возвращает список элеметов в меню
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
   после  введения интератор метод убираем так как он раскрываеит внутренюю  реализацию
    */

//  создаем  обект PancakeHouseMenuIterator( реализацию конкретного интернатора)
//  для  ArrayList и   возвращаем его

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

}