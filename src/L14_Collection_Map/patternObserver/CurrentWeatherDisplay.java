package L14_Collection_Map.patternObserver;

public class CurrentWeatherDisplay {
	int temperature;
	int humidity;
	int pressure;

	public void display() {
		System.out.println("current   - " + "temperature = " + temperature + ", humidity = " + humidity + ", pressure = " + pressure);
	}

	public void update(int temperature, int humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
}
