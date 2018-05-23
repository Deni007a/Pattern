package порождающие.Bilder_Pattern.Bulder2.cars;

import порождающие.Bilder_Pattern.Bulder2.components.Engine;
import порождающие.Bilder_Pattern.Bulder2.components.Transmission;
import порождающие.Bilder_Pattern.Bulder2.components.TripComputer;

/**
 * Автомобиль — это класс продукта.
 */
public class Car {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;

    private static double fuel = 0;

    public Car(Type type, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;

    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }



    public static double getFuel() {
        return fuel;
    }
}