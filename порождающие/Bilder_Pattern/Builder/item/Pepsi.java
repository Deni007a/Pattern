package порождающие.Bilder_Pattern.Builder.item;

// конкретная реализация напитка
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
