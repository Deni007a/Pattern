package поведенчиские.Iterator.Sumple_interator;

import java.util.ArrayList;

//  конкретная реализацию интератора для ArrayList

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0; // позиция интератора

    // конструктор получает масив элемента для пербора
    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem item = items.get(position);
        position = position + 1;
        return item;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}