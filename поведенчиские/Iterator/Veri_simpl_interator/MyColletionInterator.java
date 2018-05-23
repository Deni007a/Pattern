package поведенчиские.Iterator.Veri_simpl_interator;

public class MyColletionInterator implements MyInterator {
    MyMenuItem[] items;
    int position = 0;  //тутр хранится текущая позиция интератора

    // конструктор получает масив элемента для пербора
    public MyColletionInterator(MyMenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {

        if (position >= items.length ) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MyMenuItem next() {
        MyMenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
