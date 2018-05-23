package поведенчиские.Strategi;

public abstract class Duck implements Flu, Speak {
    Flu interFlu;
    Speak interSpeak;

    public void fly() {
        this.interFlu.fly();
    }

    public void speak() {
        this.interSpeak.speak();
    }

    abstract void appearance();

    public Duck() {
    }

    public void setInterFlu(Flu interFlu) {
        this.interFlu = interFlu;
    }

    public void setInterSpeak(Speak interSpeak) {
        this.interSpeak = interSpeak;
    }
}
