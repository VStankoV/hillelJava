package L04_Strings_SortArrays.HomeWork;

import java.util.Scanner;

public class Task02_WordShortening {
	/*	2. i18n используется для обозначения слова internationalization, где 18 означает количество букв между первой и последней в этом слове,
	такое можно встретить в среде разработчиков. Например, для слова localization используется сокращение l10n.
	Напишите функцию, которая преобразует слова введенные из консоли через пробел в сокращенную форму.
	Слова длиной меньше 4х оставить без изменений.	PS: напишите функцию, которая сокращает слово,
	в основной функции используйте метод сплит, который поместит слова в массив и для каждого из них вызовет вашу функцию
	*/
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String words = scanner.next();
		String words = "antidisestablishmentarianism, fog, honorificabilitudinitatibus, squirrel, bag, subdermatoglyphic, luminescent";

		String[] wordsArray = words.split(", ");    //remove spaces here

		String abr;
		for (String s : wordsArray) {
			if (s.length() > 3) {
				abr = makeAbreviation(s);
			} else abr = s;

			System.out.println(String.format("%4s", abr) + " <- " + s);
		}
	}

	private static String makeAbreviation(String s) {
		int lastCharIndex = s.length() - 1;
		return "" + s.charAt(0) + (lastCharIndex - 1) + s.charAt(lastCharIndex);
	}
}
