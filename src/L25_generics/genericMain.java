package L25_generics;

import L08_Inheritance.Employee;
import L08_Inheritance.Manager;
import L08_Inheritance.Person;

import java.util.*;

public class genericMain {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Manager());
		Object o = employees.get(0);

		Employee employee = (Employee) o;





		Pair<Person> personPair = new Pair<>(new Person("Vasya"),new Person("Dusya"));

		Person person = personPair.getFirst();

		Pair pair = new Pair(new Object(),new Object());

		pair.getFirst();

		Map<String,String> stringStringMap = new HashMap<>();


		copy(employees, new ArrayList<>());     //тип второго берётся у первого



		fire(Collections.singletonList(new Employee()));

		Collections.<Employee>emptyList();


	}

	public static void fire(List<? extends Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee.getName() + " is fired!");
		}
//		employees.add(new Employee());  // ? extends Employee can be only read without modification
	}


	public static void addEmployee(List<? super Employee> objects){
		objects.add(new Employee());
//		Employee employee = objects.get(0);     // ? super Employee = wild card (можно положить родителей Employee)
	}



	public static <T> void copy(List<T> source, List<T> target){
		target.addAll(source);
	}

	public static <T> void copy2(List<T> source, List<? super T> target){
		target.addAll(source);
	}

	public static <T> List<T> copy3(List<? extends T> source){
		List<T> target = new ArrayList<>();
		target.addAll(source);
		return target;
	}






}
