package L03_Cycles.HomeWork;

public class Task08_1_200ms_bestChoice {
	public static void main(String[] args) {
		//8. Найти все счастливые билеты от 100000 до 999999

		int firstHalfSum, secondHalfSum;
		int counter = 0;
		int[] array = new int[6];

		for (int n0 = 1; n0 <= 9; n0++) {
			array[0] = n0;
			for (int n1 = 0; n1 <= 9; n1++) {
				array[1] = n1;
				for (int n2 = 0; n2 <= 9; n2++) {
					array[2] = n2;
					for (int n3 = 0; n3 <= 9; n3++) {
						array[3] = n3;
						for (int n4 = 0; n4 <= 9; n4++) {
							array[4] = n4;
							for (int n5 = 0; n5 <= 9; n5++) {
								array[5] = n5;
								firstHalfSum = array[0] + array[1] + array[2];                    //because
								secondHalfSum = array[3] + array[4] + array[5];                    //there is
								if (firstHalfSum == secondHalfSum) {                            //already enough
									System.out.println("" + array[0] + array[1] + array[2] +        //loops
											" " + array[3] + array[4] + array[5]);                //here
									counter++;
								}

							}
						}
					}
				}
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
