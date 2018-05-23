package поведенчиские.Strategi;

public class RedDuck extends Duck {
    public RedDuck() {
        this.setInterFlu(new NoFly());
        this.setInterSpeak(new YesSpeak());
    }

    void appearance() {
        System.out.println("Я красная утка");
    }
}
