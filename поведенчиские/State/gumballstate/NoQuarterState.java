package поведенчиские.State.gumballstate;

//  состояние без монетки
public class NoQuarterState implements State {
    GumballMachine gumballMachine;  // обект автомата

 // в конструкторе  передаем сылку на обект автомата
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 // бросить монетку
	public void insertQuarter() {
		System.out.println("Вы бросили монетку");
		// если в автомат брошена монетка  вывести
		// собщени е в перетив СОСТОЯНИЕ HasQuarterState (есть монетка)
		gumballMachine.setState(gumballMachine.getHasQuarterState());

	}
	// вернуть монетку
	public void ejectQuarter() {
		System.out.println("Вы не бросили монетку");
	}
 // дернуть рычаг
	public void turnCrank() {
		System.out.println("Вы дернули но нет монетки");
	 }
 // выдать
	public void dispense() {
		System.out.println("Сначала вам нужно заплатить");
	} 
	
	public void refill() { }
 
	public String toString() {
		return "Ожидание монетки";
	}
}
