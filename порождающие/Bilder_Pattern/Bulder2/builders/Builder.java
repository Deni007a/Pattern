package порождающие.Bilder_Pattern.Bulder2.builders;

import порождающие.Bilder_Pattern.Bulder2.cars.Type;
import порождающие.Bilder_Pattern.Bulder2.components.Engine;
import порождающие.Bilder_Pattern.Bulder2.components.Transmission;
import порождающие.Bilder_Pattern.Bulder2.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги
 * конфигурации продукта.
 */
public interface Builder {
    public void setType(Type type);
    public void setSeats(int seats);
    public void setEngine (Engine engine);
    public void setTransmission(Transmission transmission);
    public void setTripComputer(TripComputer tripComputer);

}