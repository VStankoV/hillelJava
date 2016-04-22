package L08_Inheritance;

import L19_IO_L20_Serialization_L21.Car;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;

	private Car car;

	public Person(String name) {
//		System.out.println("Person const with str param");
		this.name = name;
	}

	public Person() {
//		System.out.println("Person default constr");
	}

	public Car getCar() {
		return car;
	}

	public boolean hasCar() {
		return car != null;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Person person = (Person) o;

		return getName() != null ? getName().equals(person.getName()) : person.getName() == null;

	}

	@Override
	public int hashCode() {
		return getName() != null ? getName().hashCode() : 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				'}';
	}
}
