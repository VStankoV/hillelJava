package L03_Cycles.HomeWork;

public class Task01 {

	/*
	* домашнее задание
	* 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
	* 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
	* 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
	* 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
	* 5. Найти сумму первых n элементов массива
	* 6. Найти минимальный и максимальный элемент массива
	* 7. Найти сумму всех четных и сумму всех нечетных элементов массива
	* 8. Найти все счастливые билеты от 100000 до 999999
	* 9. Перевести число в двоичную систему счисления (если не знаете что это можно не решать, объясню на занятии)
	*/

	static int[] array = {4, 8, 15, 16, 23, 42, 4, 8, 15, 16, 23, 42, 88, -7, 9, 8, 6, 15, 3, 900, 8};

	static void task1() {
		//1. Создайте программу, выводящую на экран все четырёхзначные
		// числа последовательности 1000 1003 1006 1009 1012 1015 ….
		int first4DigitNum = 1000;
		int last4DigitNum = 9999;
		int currentNum = first4DigitNum;
		int counter = 0;    //сколько таких чисел
		while (currentNum <= last4DigitNum) {
			System.out.println(currentNum);
			currentNum += 3;
			counter++;
		}
		System.out.println("Выведено чисел : " + counter);

	}

	static void task2() {
		//2. Создайте программу, выводящую на экран
		// первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
		int counter = 0;
		int n = 1;
		do {
			System.out.println(n);
			n += 2;
			counter++;
		} while (counter < 55);
	}

	static void task3() {
		//3. Создайте программу, выводящую на экран все неотрицательные
		// элементы последовательности 90 85 80 75 70 65 60 ….
		for (int i = 90; i > 0; i -= 5) {
			System.out.println(i);
		}
	}

	static void task4(int limit) {
		//4. Создайте программу, выводящую на экран первые 20
		// элементов последовательности 2 4 8 16 32 64 128 ….
		int counter = 0;
		int n = 2;
		do {
			System.out.println(n);
			n *= 2;
			counter++;
		} while (counter < limit);
	}

	static void task5(int range) {
		//5. Найти сумму первых n элементов массива
		int sum = 0;
		for (int i = 0; i < range; i++) {
			sum += array[i];
		}
		System.out.println(sum);
	}

	static void task6() {
		//6. Найти минимальный и максимальный элемент массива
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int k : array) {
			if (max < k) {
				max = k;
			}
			min = (min > k) ? k : min;
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);


	}

	static void task7() {
		//7. Найти сумму всех четных и сумму всех нечетных элементов массива
		int sumEven = 0,sumOdd = 0;
		for (int currentNum : array) {
			if (currentNum % 2 == 0){
				sumEven += currentNum;
			} else sumOdd += currentNum;
		}
		System.out.println("Сумма чётных   = "+sumEven);
		System.out.println("Сумма нечётных = "+sumOdd);
	}


	public static void main(String[] args) {
      task1();
/* OUTPUT:
1000
1003
1006
1009
1012...

9988
9991
9994
9997
Выведено чисел : 3000
*/

		task2();
/* OUTPUT:
1
3
5
7
9...

101
103
105
107
109
*/

		task3();
/* OUTPUT:
90
85
80
75
70...

25
20
15
10
5
*/

		task4(20);
/* OUTPUT:
2
4
8
16
32
64...

131072
262144
524288
1048576
*/

		task5(3);
/* OUTPUT:
* as it should be :)
*/

		task6();
/* OUTPUT:
Max = 900
Min = -7
*/

		task7();
/* OUTPUT:
Сумма чётных   = 1150
Сумма нечётных = 96
*/


	}
}
