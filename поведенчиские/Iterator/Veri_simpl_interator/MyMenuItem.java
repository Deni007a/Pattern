package поведенчиские.Iterator.Veri_simpl_interator;
//  элемент колекции
public class MyMenuItem {
    String name;
    double price;

    public MyMenuItem(String name,
                    double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return (name + ", $" + price);
    }
}
