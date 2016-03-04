package L08_Inheritance;

/**
 * Created by Valeron on 04.03.2016.
 */
public class Manager extends Employee {

	public void fire(Employee employee) {
		System.out.println(employee.getPosition() + " " + employee.getName() + " fired! by " + getPosition() +" " +getName());
		employee.setPosition(null);
	}
}
