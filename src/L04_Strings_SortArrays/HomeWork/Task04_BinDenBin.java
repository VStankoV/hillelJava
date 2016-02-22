package L04_Strings_SortArrays.HomeWork;

import java.util.Scanner;

public class Task04_BinDenBin {
	/*	4. Создайте класс в котором будут 2 статических метода:
- перевод числа из 2ой в 10ную систему счисления
- перевод числа из 10ной в 2ную систему счисления
В методе main другого класса дайте возможность пользователю выбрать, что он хочет делать из 2х вариантов и вызовите соответствующую функцию.
	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			args[0].trim();
		} catch (Exception e) {
			System.out.println("Welcome to our free \"BinDenBin\" converter!\n\nSelect below how would you like to use it:");
		}

		System.out.println("\"10\" - to convert number from binary to denary number system");
		System.out.println("\"2\" - to convert number from denary to binary number system");
		System.out.println("\"0\" - I want to shut it down!");

		int mode = scanner.nextInt();
		if (mode == 0) System.exit(0);
		System.out.println("Enter number: ");

		String number = scanner.next();

		switch (mode) {
			case 10:
				System.out.println("Answer: " + NumConverter.binaryToDenary(number));
				break;
			case 2:
				System.out.println("Answer: " + NumConverter.denaryToBinary(number));
				break;
			default:
				System.out.println("Wrong input! try again \n\n");
				main(new String[]{"false"});
				break;
		}

		System.out.println("Enter any key to continue or \"X\" for exit");

		if (!scanner.next().equalsIgnoreCase("x")) main(new String[]{"false"});


	}


}

class NumConverter {
	public static String denaryToBinary(String denaryNum) {
		return Integer.toBinaryString(Integer.parseInt(denaryNum));
	}

	public static String binaryToDenary(String binaryNum) {
		int denaryNum = Integer.parseInt(binaryNum, 2);
		return String.valueOf(denaryNum);
	}
}
