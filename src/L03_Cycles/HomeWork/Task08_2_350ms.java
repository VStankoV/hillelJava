package L03_Cycles.HomeWork;

public class Task08_2_350ms {
	public static void main(String[] args) {
		//8. Найти все счастливые билеты от 100000 до 999999

		int firstHalfSum, secondHalfSum;
		int counter = 0;

		for (int num = 100000; num <= 999999; num++) {
			String s = String.valueOf(num);
			firstHalfSum = 0;
			for (int i = 0; i <= 2; i++) {
				firstHalfSum += Character.getNumericValue(s.charAt(i));
			}
			secondHalfSum = 0;
			for (int i = 3; i <= 5; i++) {
				secondHalfSum += Character.getNumericValue(s.charAt(i));
			}
			if (firstHalfSum == secondHalfSum) {
				System.out.println(num);
				counter++;
			}


		}
		System.out.println("Всего счастливых билетов : " + counter);

	}
}
/* OUTPUT:
100 001
100 010
100 100
101 002...

998 899
998 989
998 998
999 999
Всего счастливых билетов : 50412
*/
