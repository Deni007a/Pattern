package порождающие.Bilder_Pattern.Bulder2.cars;

import порождающие.Bilder_Pattern.Bulder2.components.Engine;
import порождающие.Bilder_Pattern.Bulder2.components.Transmission;
import порождающие.Bilder_Pattern.Bulder2.components.TripComputer;

/**
 * Руководство автомобиля — это второй продукт. Заметьте, что руководство и сам
 * автомобиль не имеют общего родительского класса. По сути, они независимы.
 */
public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;


    public Manual(Type type, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;

    }

    public String print() {
        StringBuilder info = new StringBuilder();
        info.append("Type of car: " + type + "\n");
        info.append("Count of seats: " + seats + "\n");
        info.append("Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n");
        info.append("Transmission: " + transmission + "\n");
        info.append("Trip Computer: Trip Computer" + "\n");
        return info.toString();
    }
}
