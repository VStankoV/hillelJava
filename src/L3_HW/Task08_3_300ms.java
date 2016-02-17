package L3_HW;

public class Task08_3_300ms {
	public static void main(String[] args) {
		//8. Найти все счастливые билеты от 100000 до 999999

		int firstHalfSum, secondHalfSum;
		int counter = 0;
		int[] array = new int[6];

		for (int num = 100000; num <= 999999; num++) {

			int i = 0;
			int m = num;
			while (m > 0) {
				array[i++] = m % 10;
				m = m / 10;
			}

			firstHalfSum = 0;
			for (int y = 0; y <= 2; y++) {
				firstHalfSum += array[y];
			}
			secondHalfSum = 0;
			for (int z = 3; z <= 5; z++) {
				secondHalfSum += array[z];
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
