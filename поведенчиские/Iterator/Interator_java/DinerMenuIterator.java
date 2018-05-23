package поведенчиские.Iterator.Interator_java;


import java.util.Iterator;

// создаем интератор для  каждой реализации ,
// тут используем стандартный джава итернатор
public class DinerMenuIterator implements Iterator {
    MenuItem[] list;
    int position = 0;  //тутр хранится текущая позиция интератора

    // конструктор получает масив элемента для пербора
    public DinerMenuIterator(MenuItem[] items) {
        this.list = items;
    }

    @Override
    public boolean hasNext() {
        //if (position >= items.length || items[position] == null) {
        if (position >= list.length) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    // реализуем ремове (удаляет последний элемент )стандартного инернатора
    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (list[position - 1] != null) {
            for (int i = position - 1; i < (list.length - 1); i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }


}
