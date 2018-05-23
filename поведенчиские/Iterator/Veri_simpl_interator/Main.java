package поведенчиские.Iterator.Veri_simpl_interator;

public class Main {
    public static void main(String[] args) {
        // создаем Новую колекцию
        MyColletion myColletion = new MyColletion();

        //   созадем интернатор
        MyInterator myInterator = myColletion.returnInterator();

        while (myInterator.hasNext()){

            MyMenuItem menuItem = myInterator.next();
            System.out.println(menuItem.getName()+" "+ menuItem.price);
        }


    }

}
