package поведенчиские.Iterator.Sumple_interator;

public class Main {
    public static void main(String[] args) {
        // создаем новое меню
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        // передаем  офицанке(клиенту)  меню в конструктор
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);


        // With iterators
         waitress.printMenu();



    }
}
