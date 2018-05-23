package порождающие.Factory_Metod_several_factory;

public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {


        if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
