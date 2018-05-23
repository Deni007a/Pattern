package поведенчиские.composite.menuiterator;

import java.util.*;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();

    // здесь передается   интератор комбинации верхнего уровня и сохраняется в стеке
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    public MenuComponent next() {
        // когда клиент запрашивает следкующий элемент мы проверяем его
        // существования и  вызвваем метод hasNext ( ниже в коде)
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            // если следующий элемент существует то мы извлекаем текущий интератор из стека
            //и получаем следующий элемент
            MenuComponent component = iterator.next();
            // если сомпонет относится к класу менюкомпонет  --- значит оюнаружена новая
            // комбинация  которую нужно включить в перебор следовательно мы заносим его
            // в стек в любом случаем метод возвращает компонент
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
         // что бы провернить наличие следующего элемента мы проверяем пуст ли стек
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            // если стек не пуст  читаем из стека  верхний интернатор  и проверяем есть ли
            // в стеке следующий элемент. Если нет метод извлекат компонет из стека
            // рекурсией  метода hasNext
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                // если еть метод возвращает тру
                return true;
            }
        }
    }
	
	/*
	 * No longer needed as of Java 8
	 * 
	 * (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 *
	 * удаление не поддерживется только перебор
	public void remove() {
		throw new UnsupportedOperationException();
	}
	*/
}


