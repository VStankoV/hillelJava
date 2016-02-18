package L03_Cycles;

public class TaskFactorial {
	public static void main(String[] args) {
		int a = 5;

		int fac = 1;
		int i = 1;

		while (i <= a) {
			fac *= i++;
		}

		System.out.println(fac);
	}
}
