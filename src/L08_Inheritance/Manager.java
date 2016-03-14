package L08_Inheritance;

public class Manager extends Employee {

	public void fire(Employee employee) {
		System.out.println(employee.getPosition() + " " + employee.getName() + " fired! by " + getPosition() +" " +getName());
		employee.setPosition(null);
	}
}
