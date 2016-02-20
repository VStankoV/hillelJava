package L03_Cycles;

public class SwitchExmpl {
	public static void main(String[] args) {

		int amount = 100;
		String rating = "good";    //terrible good nice great


		switch (rating) {
			case "terrible":
				System.out.println(100 * 1);
				break;
			case "good":
				System.out.println(100 * 1.05);
				break;
			case "nice":
				System.out.println(100 * 1.1);
				break;
			case "great":
				System.out.println(100 * 1.2);
				break;
		}


	}
}
