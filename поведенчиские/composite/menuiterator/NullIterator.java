package поведенчиские.composite.menuiterator;
 
import java.util.Iterator;
// если у компонентов  меню интем нет обектов для перебора
//  то есть два выхода  1) вернуть null но тогда делать проверку на null
// 2) вариант вернуть пустой итернатор  ткотрый ВСЕГДА возвращает folse при вызове hasNext
//
public class NullIterator implements Iterator<MenuComponent> {
   
	public MenuComponent next() {
		return null;
	}
  
	public boolean hasNext() {
		return false;
	}
   
	/*
	 * No longer needed as of Java 8
	 * 
	 * (non-Javadoc)
	 * @see java.util.Iterator#remove()
	 * 
	public void remove() {
		throw new UnsupportedOperationException();
	}
	*/
}
