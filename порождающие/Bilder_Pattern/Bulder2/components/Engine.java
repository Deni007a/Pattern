package порождающие.Bilder_Pattern.Bulder2.components;

/**
 * Одна из фишек автомобиля.
 */
public class Engine {
    private final double volume;
    private double mileage;
    private static boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        this.started = true;
    }

    public void of() {
        this.started = false;
    }

    public static boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}