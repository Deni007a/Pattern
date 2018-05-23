package поведенчиские.composite.Simpl_composite;


import java.util.*;

//  композит иметт дочерние обекты
public class Composite implements Component {

    // колекция  компонентов
    private List<Component> mChild = new ArrayList<>();

    @Override
    public void print() {
        for (Component graphic : mChild) {
            graphic.print();
        }
    }

    //Adds the graphic to the composition.
    public void add(Component graphic) {
        mChild.add(graphic);
    }

    //Removes the graphic from the composition.
    public void remove(Component graphic) {
        mChild.remove(graphic);
    }


}
