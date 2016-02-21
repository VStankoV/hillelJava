package L04_Strings_SortArrays.HomeWork;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task01_eMailRefactor {
	///*	1. Напишите программу, которая заменяет символы в почтовом адресе пользователя:
	//@ заменяется на [ at ] . заменяется на [ dot ]
	private static final String EMAIL_PATTERN =
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public static void main(String[] args) {
		String eMail = getEMailFromConsole();

		eMail = eMail.replace("@", "[ at ]");
		eMail = eMail.replaceAll("\\.", "[ dot ]");

		System.out.println(eMail);
	}

	static String getEMailFromConsole() {
		Scanner scanner = new Scanner(System.in);
		String eMail;

		System.out.println("Enter your eMail (e.g. example@mail.com) : ");

		try {
			eMail = scanner.next(EMAIL_PATTERN);
		} catch (NoSuchElementException e) {
			System.out.println("Wrong eMail. Try again or press the Power Button for exit.");
			eMail = getEMailFromConsole();
		}
		scanner.close();
		return eMail;
	}

}
