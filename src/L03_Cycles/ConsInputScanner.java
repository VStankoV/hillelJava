package L03_Cycles;

import java.util.Scanner;

public class ConsInputScanner {
	public static void main(String[] args) {

		int a, b;

		Scanner sc = new Scanner(System.in);

//        sc.useDelimiter(",");

		a = sc.nextInt();
		b = sc.nextInt();

		int c = a + b;

		System.out.println(a + " + " + b + " = " + c);
	}
}
