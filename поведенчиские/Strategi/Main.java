package поведенчиские.Strategi;

public class Main {
    public static void main(String[] args) {

        RedDuck redDuck = new RedDuck();
        redDuck.appearance();
        redDuck.fly();
        redDuck.speak();
        //изменяем динамически
        redDuck.setInterSpeak(new NoSpeak() );
        redDuck.speak();
    }
}
