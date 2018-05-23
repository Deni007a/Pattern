package поведенчиские.composite.menuiterator;

import java.util.Iterator;
  
public class Waitress {
	MenuComponent allMenus;
 
	public Waitress(MenuComponent allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
   //  метод получает allMenus (MenuComponent)  и созадет для него
   // итератор (CompositeIterator)
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();

		System.out.println("\nVEGETARIAN MENU\n----");
		// перебор всех элементов
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			// метод вегетаринаство не подерживается обектами меню  подерживаеюся только
			// меню компонент

			try {
				// для каждого элемента вызвается фоаг вегетаринство если да то печатет
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
				// если  компонет не поддерживает то мы игнорируем перехваченное исключение
			} catch (UnsupportedOperationException e) {}
		}
	}
}
