package L04_Strings_SortArrays.HomeWork;

import L04_Strings_SortArrays.Utils;

public class Task05_MergeArrays {
    /*	5. Есть 2 массива упорядоченных по возрастанию.
	Получите 3й массив, который объединит все эти элементы, но также в возрастающем порядке.
	Пример ввода:	a = {1, 3, 5}	b = {2, 4, 8, 9, 12}	Результат:	c = {1, 2, 3, 4, 5, 8, 9, 12}
	*/

    public static void main(String[] args) {
/*		System.out.print("Enter first SORTED ");
		int[] array1 = Utils.getArrayFromConsole();
		System.out.print("Enter second SORTED ");
		int[] array2 = Utils.getArrayFromConsole();
	*/

        int[] array1 = {1, 2, 5};
        int[] array2 = {6, 10, 20, 30, 35, 40, 45, 50, 55};

        int[] arrayResult = new int[array1.length + array2.length];


        if (array1[array1.length - 1] < array2[array2.length - 1]) {
            int[] arrayTemp = array1.clone();
            array1 = array2.clone();
            array2 = arrayTemp.clone();
        }

        int pos2 = 0;    //Current position of second array
        int posR = 0;    //Current position of result array
        for (int i : array1) {


			if (pos2<array2.length)

				try {
					while (i > array2[pos2]) {
						arrayResult[posR++] = array2[pos2++];
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					arrayResult[posR++] = i;
					continue;
				}
			arrayResult[posR++] = i;

		}

        Utils.printArray(arrayResult);

    }

}
