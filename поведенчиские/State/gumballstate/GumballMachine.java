package поведенчиские.State.gumballstate;

public class GumballMachine {
 // все  возможные состояния
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;

 	// перемнная для хнанения стостояния инетрфес State
	State state;
	int count = 0; // количество шариков вначале автомат пуст

 // конструктор получает исходное количество шариков
	public GumballMachine(int numberGumballs) {
		// this  бьросаем этот клас (сам себя) в конструкторр
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
// если количество шариков  меньше 0 то утснавливаем
// стояние noquarterState (без монетки)
		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}
	//бросить монентку
	public void insertQuarter() {
		state.insertQuarter(); // устанавливаем стостояние
	}
	// вернуть монетку
	public void ejectQuarter() {
		state.ejectQuarter(); // установть стосяние
	}
 // дернуть рычаг
	public void turnCrank() {
		// дернуть рычаи и выдать монетку
		state.turnCrank(); // установть стосяние
		state.dispense();  // установть стосяние
	}
	//  метод позволяет другим обектам State перевесть автомт в другое стосяние
	void setState(State state) {
		this.state = state;
	}
 // вспомогательй метод  вотпускант шарик и именьшает счетчик на  еденицу
	void releaseBall() {
		System.out.println("Шарик выдан заберите.");
		if (count != 0) {
			count = count - 1;
		}
	}
 //  получть количество шариков
	int getCount() {
		return count;
	}
 // пополнение шариков
	void refill(int count) {
		this.count += count;
		System.out.println("автомт пополнет  шариками  "
				+ this.count);
		state.refill(); // установть стосяние
	}


    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
