package L24_producer_consummer.generics;

import L08_Inheritance.Employee;
import L08_Inheritance.Manager;
import L08_Inheritance.Person;

import java.util.ArrayList;
import java.util.List;

public class genericMain {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Manager());
		Object o = employees.get(0);

		Employee employee = (Employee) o;

	}
}
