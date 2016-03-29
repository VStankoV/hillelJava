package L14_Collection_Map.patternObserver;

public class WeatherStation {
	int temperature;
	int humidity;
	int pressure;

	CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay();
	StatisticDisplay statisticDisplay = new StatisticDisplay();
	ForecastDisplay forecastDisplay = new ForecastDisplay();

	public void stateChanged() {
		currentWeatherDisplay.update(temperature, humidity, pressure);
		currentWeatherDisplay.display();

		statisticDisplay.update(temperature, humidity, pressure);
		statisticDisplay.display();

		forecastDisplay.update(temperature, humidity, pressure);
		forecastDisplay.display();

		System.out.println();

	}

	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
		station.temperature = 20;
		station.humidity = 50;
		station.pressure = 780;

		station.stateChanged();

		station.temperature = 25;
		station.humidity = 40;
		station.pressure = 730;

		station.stateChanged();


	}
}
