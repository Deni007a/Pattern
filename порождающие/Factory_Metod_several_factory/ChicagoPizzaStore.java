package порождающие.Factory_Metod_several_factory;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {

        if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
