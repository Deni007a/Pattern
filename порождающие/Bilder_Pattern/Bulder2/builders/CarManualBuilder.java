package порождающие.Bilder_Pattern.Bulder2.builders;

import порождающие.Bilder_Pattern.Bulder2.cars.Manual;
import порождающие.Bilder_Pattern.Bulder2.cars.Type;
import порождающие.Bilder_Pattern.Bulder2.components.Engine;
import порождающие.Bilder_Pattern.Bulder2.components.Transmission;
import порождающие.Bilder_Pattern.Bulder2.components.TripComputer;

/**
 * В отличие от других создающих паттернов, Строители могут создавать совершенно
 * разные продукты, не имеющие общего интерфейса.
 *
 * В данном случае мы производим руководство пользователя автомобиля с помощью
 * тех же шагов, что и сами автомобили. Это устройство позволит создавать
 * руководства под конкретные модели автомобилей, содержащие те или иные фичи.
 */
public class CarManualBuilder implements Builder{
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;


    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }



    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer);
    }
}