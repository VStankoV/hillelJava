package L14_Collection_Map.patternObserver;

import java.util.ArrayList;
import java.util.List;

public class StatisticDisplay {

	private List<Integer> temperatures = new ArrayList<>();
	private List<Integer> humiditys = new ArrayList<>();
	private List<Integer> pressurs = new ArrayList<>();

	public void update(int temperature, int humidity, int pressure) {
		temperatures.add(temperature);
		humiditys.add(humidity);
		pressurs.add(pressure);
	}

	public void display() {
		System.out.println("statistic - " + "temp : " + temperatures + " humid : " + humiditys + " pres : " + pressurs);
	}
}
