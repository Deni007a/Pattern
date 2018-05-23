package поведенчиские.composite.menu;

import java.util.Iterator;
import java.util.ArrayList;
// это композит тоесть со списком дочерних компонентов
public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	String name;
	String description;
  
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	@Override
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	@Override
	public MenuComponent getChild(int i) {

		return (MenuComponent)menuComponents.get(i);
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getDescription() {
		return description;
	}
	@Override
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  // с и нтератором
//		Iterator<MenuComponent> iterator = menuComponents.iterator();
//		while (iterator.hasNext()) {
//			MenuComponent menuComponent =
//				(MenuComponent)iterator.next();
//			menuComponent.print();

		for (MenuComponent m : menuComponents){
			m.print();
		}
	}
}
