package порождающие.Bilder_Pattern.Builder.pasking;

//Создайте конкретные классы, реализующие интерфейс Packing упаковки.
// упаковываем напитки
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}