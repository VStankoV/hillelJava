package L08_Inheritance;

public class A1_Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Ivan");

		Employee employee = new Employee();
		employee.setPosition("programmer");
		employee.setName("Denis");

		Manager manager = new Manager();
		manager.setPosition("director");
		manager.setName("Igor");

		manager.fire(manager);


	}
}
