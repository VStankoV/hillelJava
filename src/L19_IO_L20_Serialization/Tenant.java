package L19_IO_L20_Serialization;

public class Tenant {
	String name;

	public Tenant(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tenant{" +
				"name='" + name + '\'' +
				'}';
	}
}
