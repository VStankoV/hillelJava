package L04_Strings_SortArrays.HomeWork;

public class Task03_Palindrome {
	/*	3. Определить является ли слово палиндромом, т.е. читается одинаково, слева направо и справа налево.
Определить количество таких слов в тексте, в котором все слова введены через запятую.
Пример ввода: deleveled, evitative, cat, dog, deified
Результат: There are 3 palindromes in the text
PS: используйте метод split c параметром "," и потом метод trim, чтобы удалить лишние пробелы слева и справа
	*/
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		String words = scanner.next();
		String words = "cammac, madam, table, radar, shkeeper, redder";

		String[] wordsArray = words.split(", ");

		int countOfPalindromes = 0;
		boolean flag;

		for (String s : wordsArray) {
			s = s.trim();
			flag = true;
			for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
				if (s.charAt(i) != s.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) countOfPalindromes++;
		}

		System.out.println("There are "+countOfPalindromes+" palindromes in the text");

	}
}
