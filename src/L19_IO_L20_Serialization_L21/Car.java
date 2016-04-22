package L19_IO_L20_Serialization_L21;

import L08_Inheritance.Person;
import java.io.Serializable;

public class Car implements Serializable {
	private static final long serialVersionUID = 1;
	private final String brand;
	private final int year;
	private final Person owner;
	private transient Tenant tenant;        //transient - ne serializovat`

	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				", year=" + year +
				", owner=" + owner +
				", rentor=" + tenant +
				'}';
	}

	public Car(String brand, int year, Person owner) {
//		System.out.println("Car constr");
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
