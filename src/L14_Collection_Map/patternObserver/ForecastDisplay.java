package L14_Collection_Map.patternObserver;

import java.util.Random;

public class ForecastDisplay {
	int temperature;
	int humidity;
	int pressure;

	public void update(int temperature, int humidity, int pressure) {
		this.temperature = randomize(temperature);
	}

	public void display() {
		System.out.println("Forecast  - " + "temperature = " + temperature + ", humidity = " + humidity + ", pressure = " + pressure);
	}


	private int randomize(int value) {
		Random random = new Random();
		double seed = random.nextDouble() / 5 + 0.9;
		return (int) (value * seed);
	}
}