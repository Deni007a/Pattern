package поведенчиские.Iterator.Veri_simpl_interator;
// колекция

// добовляем интерфейс ReturnInretator для  реализации итернатора
public class MyColletion  implements ReturnInretator{


    static final int MAX_ITEMS = 6; // длина колекции
    int numberOfItems = 0;  // индекс позиции
    MyMenuItem[] myInteger;


    public MyColletion() {
        myInteger = new MyMenuItem[MAX_ITEMS];
// также инициализируем в элементы в конструкторе
        addItem("Vegetarian BLT", 2.99);
        addItem("BLT", 2.99);
        addItem("Soup of the day", 3.29);
        addItem("Hotdog", 3.05);
        addItem("Steamed Veggies and Brown Rice", 3.99);
        addItem("Pasta", 3.89);
    }

    // метод для добовления в колекцию
    public void addItem(String name, double price) {

        MyMenuItem mymenuItem = new MyMenuItem(name, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            this.myInteger[numberOfItems] = mymenuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
// Возвращаем конкретный итернатор для этой колекции
    @Override
    public MyInterator returnInterator() {
        return new MyColletionInterator(myInteger);
    }
}
