package L19_IO_L20_Serialization;

import L08_Inheritance.Person;
import java.io.Serializable;

public class Car implements Serializable {
	private final String brand;
	private final int year;
	private final Person owner;
	private transient Rentor rentor;        //transient - ne serializovat`

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				", year=" + year +
				", owner=" + owner +
				", rentor=" + rentor +
				'}';
	}

	public Car(String brand, int year, Person owner) {
		this.brand = brand;
		this.year = year;
		this.owner = owner;
	}

	public String getBrand() {
		return brand;
	}

	public int getYear() {
		return year;
	}

}
