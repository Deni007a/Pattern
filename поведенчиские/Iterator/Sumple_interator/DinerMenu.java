package поведенчиские.Iterator.Sumple_interator;

//  вторая реализация менб в  масиве


public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
// также инициализируем в элементы в конструкторе
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese",
                false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
                true, 3.89);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            this.menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    /*
// возвращает список элеметов в меню
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    после  введения интератор метод убираем так как он раскрываеит внутренюю  реализацию
    */

//  создаем  обект DinerMenuIterator( реализацию конкретного интернатора)
//  для масива и   возвращаем его

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
       // return new AlternatingDinerMenuIterator(menuItems);


    }
}