package L19_IO_L20_Serialization;

import L08_Inheritance.Person;

import java.io.Serializable;

public class Car implements Serializable {
	private static final long serialVersionUID = 1;
	private final String brand;
	private final int year;
	private final Person owner;
	private transient Tenant tenant;        //transient - ne serializovat`

	public Car(String brand, int year, Person owner) {
//		System.out.println("Car constr");
		this.brand = brand;
		this.year = year;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				", year=" + year +
				", owner=" + owner +
				", rentor=" + tenant +
				'}';
	}

	public String getBrand() {
		return brand;
	}

	public int getYear() {
		return year;
	}

}
