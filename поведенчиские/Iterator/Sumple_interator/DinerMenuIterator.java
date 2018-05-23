package поведенчиские.Iterator.Sumple_interator;


// создаем интератор для  каждой реализации
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;  //тутр хранится текущая позиция интератора

        // конструктор получает масив элемента для пербора
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        //if (position >= items.length || items[position] == null) {
        if (position >= items.length ) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
