package L04_Strings_SortArrays;

import java.util.Scanner;

public class Utils {

    public static int[] getArrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array size :");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + i + " element: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(" " + i);
        }
    }
}
