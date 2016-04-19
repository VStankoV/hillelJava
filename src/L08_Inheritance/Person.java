package L08_Inheritance;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public Person() {
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
