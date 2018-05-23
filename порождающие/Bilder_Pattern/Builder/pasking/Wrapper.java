package порождающие.Bilder_Pattern.Builder.pasking;

//Создайте конкретные классы, реализующие интерфейс Packing упаковки.
// упаковываем гамбургеры
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}