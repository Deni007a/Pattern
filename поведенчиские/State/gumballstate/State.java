package поведенчиские.State.gumballstate;

public interface State {
  // действия
	public void insertQuarter(); // бросить монентку
	public void ejectQuarter(); // вернуть монетку
	public void turnCrank(); // дернуть рычаг
	public void dispense(); // выдать
	
	public void refill();  // заправка
}
// состояния
// для каждого состояния делаем отдельный класс
/*
		sold out   		продано
		no quarter 		без четверти
		has quarter 	имеет четверть
		sold 			продан
		sold out 		продано


		*/