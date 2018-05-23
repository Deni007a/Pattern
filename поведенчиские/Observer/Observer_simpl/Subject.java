package поведенчиские.Observer.Observer_simpl;
// субект
public interface Subject {
    void registerObserver(Observer o); // регистрация наблюдателя
    void removeObserver(Observer o); // удаления наблюдателя
    void notifyObserver(); // уведомлять наблюдателя

}


