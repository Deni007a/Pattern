package поведенчиские.composite.Simpl_composite;


// лист   он не имеет дочерних обектов
public class Leaf implements Component {
    @Override
    public void print() {
        System.out.println("Лист");
    }
}
